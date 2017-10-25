package com.example.jtwheadon.notetakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define a viewgroup (and late view) objects
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(2);

        // Add Title Edit Text
        EditText titleEditText = new EditText(this);
        titleEditText.setHint(R.string.title_hint);
        GridLayout.LayoutParams titleLayoutParams = new GridLayout.LayoutParams();
        titleLayoutParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
        titleLayoutParams.width = GridLayout.LayoutParams.MATCH_PARENT;
        titleEditText.setLayoutParams(titleLayoutParams);
        gridLayout.addView(titleEditText);

        // Add spinner
        Spinner typeSpinner = new Spinner(this);
        ArrayAdapter<CharSequence> noteTypes = ArrayAdapter.createFromResource(this,
                R.array.note_types, android.R.layout.simple_spinner_item);
        noteTypes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(noteTypes);

        GridLayout.LayoutParams typeSpinnerParams = new GridLayout.LayoutParams();
        typeSpinnerParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
        typeSpinnerParams.width = GridLayout.LayoutParams.MATCH_PARENT;
        typeSpinner.setLayoutParams(typeSpinnerParams);
        gridLayout.addView(typeSpinner);

        setContentView(gridLayout);



    }
}
