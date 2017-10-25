package com.example.jtwheadon.notetakingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Spinner;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        // define a viewgroup (and late view) objects
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(2);

        // Add Title Edit Text
        EditText titleEditText = new EditText(this);
        titleEditText.setHint(R.string.title_hint);
        gridLayout.addView(titleEditText);

        // Add spinner
        /*
        Spinner typeSpinner = new Spinner(this);
        typeSpinner.
        */
    }

}
