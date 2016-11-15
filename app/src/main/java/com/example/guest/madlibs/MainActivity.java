package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.editText) EditText mName;
    @Bind(R.id.editText2) EditText mName2;
    @Bind(R.id.spinner) Spinner mAnimal;
    @Bind(R.id.editText4) EditText mExclamation;
    @Bind(R.id.editText5) EditText mVerb;
    @Bind(R.id.editText6) EditText mNoun;
    @Bind(R.id.showStoryButton) Button mShowStoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String[] items = new String[]{"Cat", "Dog", "Honey Badger"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        mAnimal.setAdapter(adapter);

        mShowStoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                String name = mName.getText().toString();
                String name2 = mName2.getText().toString();
                String animal = mAnimal.getSelectedItem().toString();
                String exclamation = mExclamation.getText().toString();
                String verb = mVerb.getText().toString();
                String noun = mNoun.getText().toString();
                String[] wordArray = {name, name2, animal, exclamation, verb, noun};
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("wordArray", wordArray);
                startActivity(intent);
            }
        });
    }
}
