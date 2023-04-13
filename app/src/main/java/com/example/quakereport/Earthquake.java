package com.example.quakereport;

public class Earthquake {
    /** Magnitude of Earthquake */
    private double mMagnitude;

    /** Location of Earthquake */
    private String mLocation;

    /** Date of Earthquake */
    private String mDate;

    // Time of earthquake //
    private long mTimeInMilliseconds;


    /**
     * Constructor a new {@link Earthquake} Object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earhquake happened
     */
    public Earthquake(double magnitude, String location, String date, long timeInMilliseconds ){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /** Return the magnitude of the earthquake. */
    public double getmMagnitude(){
        return mMagnitude;
    }

    /** Return the location of the earthquake. */
    public String getmLocation(){
        return mLocation;
    }

    /** Return the date of the earthquake. */
    public String getmDate(){
        return mDate;
    }

    /** Return the time of the earthquake */
    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

}