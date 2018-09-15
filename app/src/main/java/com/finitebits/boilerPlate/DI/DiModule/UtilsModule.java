package com.finitebits.boilerPlate.DI.DiModule;

import com.finitebits.boilerPlate.ThirdParty.ImageLoader;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by myorh on 15/09/2018.
 */


@Module
public class UtilsModule {

    @Provides
    @Singleton
    ImageLoader providesImageLoader(){
        return new ImageLoader();
    }

}
