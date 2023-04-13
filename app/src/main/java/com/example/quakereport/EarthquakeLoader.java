package com.example.quakereport;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

/** Loads a list of earthquakes by using an AsyncTask to perform the network request
 * to the given URL
 */
public class EarthquakeLoader extends AsyncTaskLoader<Void> {
    /** TAG for log messages */
     private static final String LOG_TAG = EarthquakeLoader.class.getName();

     /** Query URL **/
     private String mURL;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     * @param context of the activity
     * @param url load data from
     */
    public EarthquakeLoader(Context context, String url){
        super(context);
        mURL = url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }

    /** This is on the background thread **/
    @Override
    public Void loadInBackground(){
        if(mURL == null){
            return null;
        }
        // perform the network request , parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mURL);
    }


}
