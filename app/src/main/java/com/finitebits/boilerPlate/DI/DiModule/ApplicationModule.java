package com.finitebits.boilerPlate.DI.DiModule;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by myorh on 09/09/2018.
 */

@Module
public class ApplicationModule {

    private Context appContext;

    public ApplicationModule(@NonNull Context context) {
        appContext = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return appContext;
    }

    //TODO: this module should provide app database.
}
