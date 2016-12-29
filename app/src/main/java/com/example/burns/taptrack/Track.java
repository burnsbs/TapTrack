package com.example.burns.taptrack;
//this is a change
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Track extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
    }

    //ANDROID HOOKS TO GET DB OBJECT

    //GUI Select how to view the data
    //get the data you want to look at
    //   by event(s)
    //   apply other user specified constraints
    //   construct sequal query and run with db.query
    //   loop through rows of data you get
    //       post process accordingly
    //get user data view method
    //apply our data to the view
}
