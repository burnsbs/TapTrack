package com.example.burns.taptrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Tap extends AppCompatActivity {
    // TapState variable to hold the current state of the phone
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        //collect current state of the phone in TapState variable
    }
    /*
    //read table in database about event types, etc to populate gui
    Spinner spinner = (Spinner) findViewById(R.id.tap_choices_spinner);
    // Create an ArrayAdapter using the string array and a default
    // spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.tap_choices_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
    spinner.setAdapter(adapter);
    */

    // ANDRIOD HOOK FOR GETTING OUR DB OBJECT

    //// INSERT OTHER GUI CODE FOR GETTING USER INFO
    // collect Event info from DB table
    // create bottons selectors etc
    // create display of current selections

    //final function to be called when user has specified everything we need to setup the table entry
    //onSubmit()
    //create database ContentValue object (map)
    //for each column in our table entry
    //     put an item in our ContentValue of the type, name and value for each column
    //insert the row
    //exit activity
}
