package com.finitebits.boilerPlate;

import android.app.Application;

import com.finitebits.boilerPlate.DI.ApplicationComponent;
import com.finitebits.boilerPlate.DI.DaggerApplicationComponent;
import com.finitebits.boilerPlate.DI.DiModule.ApplicationModule;
import com.finitebits.boilerPlate.DI.DiModule.UtilsModule;
import com.finitebits.boilerPlate.DI.DiModule.ViewModelModule;
import com.finitebits.boilerPlate.ThirdParty.ImageLoader;

/**
 * Created by myorh on 08/09/2018.
 */

public class MainApp extends Application {
    protected static ApplicationComponent applicationComponent;
    public static ApplicationComponent getComponent(){
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = buildComponent();
    }

    private ApplicationComponent buildComponent(){
        return applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .viewModelModule(new ViewModelModule())
                .utilsModule(new UtilsModule())
                .build();
    }
}
