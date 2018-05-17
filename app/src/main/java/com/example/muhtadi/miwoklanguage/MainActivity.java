package com.example.muhtadi.miwoklanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that we will modify
        TextView tvColors = (TextView) findViewById(R.id.colors);
        TextView tvFamily = (TextView) findViewById(R.id.family);
        TextView tvPhrases = (TextView) findViewById(R.id.phrases);
        TextView tvNumbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that View (Colors Text View)
        tvColors.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Set a click listener on that View (Family TV)
        tvFamily.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        //Set a click listener on that View (Phrases TV)
        tvPhrases.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

        //Set a click listener on that View (Number TV)
        tvNumbers.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumberActivity}
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numberIntent);
            }
        });
    }
}
