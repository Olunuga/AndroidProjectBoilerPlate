package com.finitebits.boilerPlate.DI;

import android.app.Activity;

import com.finitebits.boilerPlate.DI.DiModule.ApplicationModule;
import com.finitebits.boilerPlate.DI.DiModule.UtilsModule;
import com.finitebits.boilerPlate.DI.DiModule.ViewModelModule;
import com.finitebits.boilerPlate.MainApp;
import com.finitebits.boilerPlate.Module.SampleModule.ReNameMeFragment;
import com.finitebits.boilerPlate.Module.SampleModule.RenameMeViewModel;
import com.finitebits.boilerPlate.ThirdParty.ImageLoader;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by myorh on 09/09/2018.
 */

@Component(modules = {ApplicationModule.class,ViewModelModule.class, UtilsModule.class})
@Singleton
public interface ApplicationComponent {
        //Activities TODO: inject activities here.
        void injectActivity(Activity activity);

        //Fragments TODO: inject fragments here.
        void injectReNameMeFragment(ReNameMeFragment reNameMeFragment);

        //ViewModels TODO: inject ViewModels here.
        void injectSampleViewModel(RenameMeViewModel renameMeViewModel);

        ImageLoader getImageLoader();
}

