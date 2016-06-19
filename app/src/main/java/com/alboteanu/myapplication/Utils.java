package com.alboteanu.myapplication;

import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;

/**
 * Created by Dan on 31/05/2016.
 */
public class Utils {

    public static final String FIREBASE_PROPERTY_TIMESTAMP = "timestamp_created";
    private static FirebaseDatabase mDatabase;
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        return mDatabase;
    }


}
