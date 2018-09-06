package io.andronicus.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "LogDebug";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
