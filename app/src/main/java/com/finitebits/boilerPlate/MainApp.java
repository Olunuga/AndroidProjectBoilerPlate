package com.finitebits.boilerPlate;

import android.app.Application;

import com.finitebits.boilerPlate.ThirdParty.ImageLoader;

/**
 * Created by myorh on 08/09/2018.
 */

public class MainApp extends Application {
    private static MainApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public static MainApp getInstance(){
        return INSTANCE;
    }

    public ImageLoader getImageLoader(){
        return ImageLoader.getINSTANCE();
    }

}
