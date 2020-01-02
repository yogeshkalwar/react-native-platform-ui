package com.yogi.reactlibrary.helpers;

import android.util.Log;

import com.yogi.reactlibrary.BuildConfig;

public class ELogger {

    public static void log(final String tag, final String message) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message);
        }
    }
}
