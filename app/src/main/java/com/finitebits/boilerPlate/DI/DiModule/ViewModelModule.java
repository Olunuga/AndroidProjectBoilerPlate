package com.finitebits.boilerPlate.DI.DiModule;

import com.finitebits.boilerPlate.Networking.NetworkingManager;
import com.finitebits.boilerPlate.Repository.SampleModelRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by myorh on 09/09/2018.
 */


@Module
public class ViewModelModule {

    private NetworkingManager networkingManager;

    public ViewModelModule(){
        networkingManager = new NetworkingManager();
    }

    @Provides
    NetworkingManager provideNetworkingManager(){
        return networkingManager;
    }

    @Provides
    @Singleton
    SampleModelRepository provideSampleRepository(){
        return new SampleModelRepository(networkingManager);
    }
}
