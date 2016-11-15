package com.example.guest.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        Resources res = getResources();
        String[] myStory = res.getStringArray(R.array.my_story);
        String[] wordArray = intent.getStringArrayExtra("wordArray");
        TextView output = (TextView) findViewById(R.id.textStory);
//        output.setText("One Day " + wordArray[0] + " and " + wordArray[1] + " were walking through the woods, when suddenly a giant " + wordArray[2] + " appeared. " + wordArray[3] + ", " + wordArray[0] + " cried. The two of them " + wordArray[4] + " as quickly possible, and when they were safe, " + wordArray[0] + " and " + wordArray[1] + " gave each other a giant " + wordArray[5]);

        output.setText(myStory[0] + wordArray[0] + myStory[1] + wordArray[1] + myStory[2] + wordArray[2] + myStory[3] + wordArray[3] + myStory[4] + wordArray[0] + myStory[5] + wordArray[4] + myStory[6] + wordArray[0] + myStory[7] + wordArray[1] + myStory[8] + wordArray[5] + myStory[9]);
    }
}
