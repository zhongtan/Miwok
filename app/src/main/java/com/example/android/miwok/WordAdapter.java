package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZhengHong on 15/06/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the background color of the list of words.
     */
    private int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the {@link Word} object located at this position of the list.
        Word currentWord = getItem(position);

        // Check if the existing code is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        // Find the TextView from the list_item.xml with ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on the
        // miwokTextView.
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView from the list_item.xml with ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the defaultTextView object and set this text on the
        // defaultTextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView from the list_item.xml with ID image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            iconView.setImageResource(currentWord.getImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        } else {
            // otherwise hide the ImageView
            iconView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout
        return listItemView;

    }
}
