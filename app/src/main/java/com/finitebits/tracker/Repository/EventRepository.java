package com.finitebits.tracker.Repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.finitebits.tracker.Networking.BaseResponse;
import com.finitebits.tracker.Networking.NetworkingManager;
import com.finitebits.tracker.Repository.Model.Event;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by myorh on 08/09/2018.
 */

public class EventRepository {
    private static EventRepository INSTANCE;
    private NetworkingManager networkingManager;


    private EventRepository() {
        //To prevent initialization of this class
    }


    //TODO: make use of dependency injection here
    public static EventRepository getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new EventRepository();
        }

        return INSTANCE;
    }


    public LiveData<List<Event>> getEvents() {
        final MutableLiveData<List<Event>> eventList = new MutableLiveData<>();
        new NetworkingManager().getEventService().getEvents().enqueue(new Callback<BaseResponse<List<Event>>>() {
            @Override
            public void onResponse(Call<BaseResponse<List<Event>>> call, Response<BaseResponse<List<Event>>> response) {
                if(Objects.equals(response.body().getStatus(), "Success")){
                    eventList.setValue(response.body().data);// use data
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<List<Event>>> call, Throwable t) {

            }
        });
       return eventList;
    }

}
