package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PaulnKimmy on 20/10/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        ImageView imgViewer = (ImageView) listItemView.findViewById(R.id.list_image_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());
        miwokTextView.setText(currentWord.getMiwokTranslation());


        if(currentWord.getImageResourceId() != 0) {
            imgViewer.setImageResource(currentWord.getImageResourceId());
        }
        else
        {

            imgViewer.setVisibility(View.GONE);
        }


        return listItemView;

    }


}
