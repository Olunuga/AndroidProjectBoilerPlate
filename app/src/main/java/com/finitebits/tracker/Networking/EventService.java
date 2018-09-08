package com.finitebits.tracker.Networking;

import com.finitebits.tracker.Repository.Model.Event;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by myorh on 08/09/2018.
 */

public interface EventService {


    //TODO: Wrap this around a base response body.
    @GET("/things/xVrP.json")
    Call<BaseResponse<List<Event>>> getEvents();

}

