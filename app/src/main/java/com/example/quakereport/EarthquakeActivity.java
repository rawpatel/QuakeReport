package com.example.quakereport;

import android.content.Loader;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class EarthquakeActivity extends AppCompatActivity implements Callbacks<List<Earthquake>> {
    /** Constant vale for the Earthquake loader ID . We can choose the any integer .
     * This really only comes into play if you' re using multiple loaders */
    private static final int EARTHQUAKE_LOADER_ID = 1;

    @Override
    public Loader<List<Earthquake>> onCreateLoader(int i, Bundle bundle){
        // Create a new loader for the given URL
        return new EarthquakeLoader(this,USGS_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Earthquake>> loader, List<Earthquake> earthquakes){
        // Clear the  Adapter of Pervious Earthquake data
        mAdapter.clear();
    }
}
