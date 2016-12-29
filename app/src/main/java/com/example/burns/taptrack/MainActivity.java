package com.example.burns.taptrack;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.File;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase tapTrackDatabase;
    String tableName = "FAKE";
    //@Override

    public void connect_to_db(){

       // System.out.println(android.os.Environment.getDataDirectory().getPath()+"taptrackdbfile.db");
        System.out.println(tableName);
        System.out.println(this.getFilesDir().getPath()+File.separator+"taptrackdbfile.db");
        tapTrackDatabase = SQLiteDatabase.openOrCreateDatabase(this.getFilesDir().getPath()+File.separator+"taptrackdbfile.db", null); //opens or creates the db
        Cursor taptrackcursor  = tapTrackDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '"+tableName+"'", null);
        if(taptrackcursor!=null||taptrackcursor.getCount()==0){
            // create all tables, including
            // track: lists all events
            // track_types: lists all types of tracks
            String sqlString = "CREATE TABLE IF NOT EXISTS FAKE (" +
                    "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    "ButtonName CHAR(50) NOT NULL" +
                    ")";
            System.out.println(sqlString);
            taptrackcursor = tapTrackDatabase.rawQuery(sqlString , null);
            System.out.println(taptrackcursor.getCount());
            sqlString = "INSERT INTO FAKE (ButtonName) " +
                    "VALUES ('red')";
            System.out.println(sqlString);
            taptrackcursor = tapTrackDatabase.rawQuery(sqlString , null);
            sqlString = "INSERT INTO FAKE (ButtonName)  " +
                    "VALUES ('blue');";
            taptrackcursor = tapTrackDatabase.rawQuery(sqlString , null);
        }
                //classnames are always in caps
        // smash together class namse


    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //check if database exist
        //call create database if it doesn't
        //check if database needs an update
        //connect to the database
         this.connect_to_db();

        }

    /** Called when the user clicks the Tap button */
    public void OpenTapActivity(View view) {
        /*This needs to capture
        Location
        Time
        Temp?
        Any other info
        */

        /*
        then allow user to use radio buttons to make selection
         */
        Intent intent = new Intent(this, Tap.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
// Called when user clicks the Track button
    public void OpenTrackActivity(View view) {
        Intent intent = new Intent(this, Track.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}// mainActivity
