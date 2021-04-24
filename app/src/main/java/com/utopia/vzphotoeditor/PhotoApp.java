package com.utopia.vzphotoeditor;

import android.app.Application;
import android.content.Context;

public class PhotoApp extends Application {
    private static PhotoApp sPhotoApp;
    private static final String TAG = PhotoApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        sPhotoApp = this;
    }
}
