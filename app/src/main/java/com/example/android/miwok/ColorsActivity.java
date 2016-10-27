package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Black", "әpә", R.drawable.color_black));
        words.add(new Word("Brown", "әṭa", R.drawable.color_brown));
        words.add(new Word("Dusty Yellow", "angsi", R.drawable.color_dusty_yellow));
        words.add(new Word("Gray", "tune", R.drawable.color_gray));
        words.add(new Word("Green", "taachi", R.drawable.color_green));
        words.add(new Word("Mustard Yellow", "chalitti", R.drawable.color_mustard_yellow));
        words.add(new Word("Red", "teṭe", R.drawable.color_red));
        words.add(new Word("White", "kolliti", R.drawable.color_white));

        WordAdapter WordAdapterX = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(WordAdapterX);
    }

}