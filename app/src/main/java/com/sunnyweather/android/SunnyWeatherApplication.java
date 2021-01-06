package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.media.session.MediaSession;

public class SunnyWeatherApplication extends Application {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
         context=getApplicationContext();
    }
    public static  final String TOKEN="flJ1K8iHWin3s2xk";
}
