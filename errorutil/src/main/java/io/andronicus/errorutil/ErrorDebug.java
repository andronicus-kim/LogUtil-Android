package io.andronicus.errorutil;

import android.util.Log;

public class ErrorDebug {
    private static final String TAG = "ErrorDebug";
    public static void e(String message){
        Log.e(TAG, message);
    }
}
