package com.example.muhtadi.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);

        // Create a list of words
        String [][] data = new String[][]{
                {"father", "әpә"},
                {"mother", "әṭa"},
                {"son", "angsi"},
                {"daughter", "tune"},
                {"older brother", "taachi"},
                {"younger brother", "chalitti"},
                {"older sister", "teṭe"},
                {"younger sister", "kolliti"},
                {"grandmother ", "ama"},
                {"grandfather", "paapa"}
        };

        ArrayList<Word> words = new ArrayList<Word>();

        for (int i =0 ; i<data.length; i++){
            Word objectWord = new Word();
            objectWord.setmMiwok(data[i][0]);
            objectWord.setmTranslation(data[i][1]);

            words.add(objectWord);
        }

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
