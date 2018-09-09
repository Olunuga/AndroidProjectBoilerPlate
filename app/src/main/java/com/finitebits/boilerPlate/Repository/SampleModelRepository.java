package com.finitebits.boilerPlate.Repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.finitebits.boilerPlate.Networking.ResponseModel.BaseResponse;
import com.finitebits.boilerPlate.Networking.NetworkingManager;
import com.finitebits.boilerPlate.Repository.Model.SampleModel;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by myorh on 08/09/2018.
 */

public class SampleModelRepository {
    private static SampleModelRepository INSTANCE;
    private NetworkingManager networkingManager;


    private SampleModelRepository() {
        //To prevent initialization of this class
    }


    //TODO: make use of dependency injection here
    public static SampleModelRepository getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SampleModelRepository();
        }

        return INSTANCE;
    }


    public LiveData<List<SampleModel>> getEvents() {
        final MutableLiveData<List<SampleModel>> sampleModelList = new MutableLiveData<>();
        new NetworkingManager().getSampleModelService().getSampleModelList().enqueue(new Callback<BaseResponse<List<SampleModel>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseResponse<List<SampleModel>>> call, @NonNull Response<BaseResponse<List<SampleModel>>> response) {
                if(Objects.equals(response.body().getStatus(), "Success")){
                    sampleModelList.setValue(response.body().data);// use data
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<List<SampleModel>>> call, Throwable t) {

            }
        });
       return sampleModelList;
    }

}
