package com.example.quakereport;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static final String LOG_TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        //Get the list of earthquakes from {@link QueryUtils}
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();

        // Find the reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) earthquakeListView.findViewById();

        //Create a new adapter that takes the list of the earthquakes as input.

       final EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);


        // Set on adapter on the {@link ListView}
        // so the list can be pulated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}