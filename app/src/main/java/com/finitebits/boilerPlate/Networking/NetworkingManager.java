package com.finitebits.boilerPlate.Networking;

import com.finitebits.boilerPlate.Networking.Service.SampleModelService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by myorh on 08/09/2018.
 */

public class NetworkingManager {
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.jasonbase.com")
            .build();

    public SampleModelService getSampleModelService(){
       return retrofit.create(SampleModelService.class);
    }

}
