package com.finitebits.tracker.Networking;

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

    public EventService getEventService(){
       return retrofit.create(EventService.class);
    }

}
