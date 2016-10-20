package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "1"));
        words.add(new Word("two", "2"));
        words.add(new Word("three", "3"));
        words.add(new Word("four", "4"));
        words.add(new Word("five", "5"));
        words.add(new Word("six", "6"));
        words.add(new Word("seven", "7"));
        words.add(new Word("eight", "8"));
        words.add(new Word("nine", "9"));
        words.add(new Word("ten", "10"));

        //LinearLayout rootView = (LinearLayout) findViewById(rootview);
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        WordAdapter WordAdapterX = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(WordAdapterX);


    }
}
