package com.finitebits.boilerPlate.Networking.Service;

import com.finitebits.boilerPlate.Networking.ResponseModel.BaseResponse;
import com.finitebits.boilerPlate.Repository.Model.SampleModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by myorh on 08/09/2018.
 */

public interface SampleModelService {

    //TODO: Wrap this around a base response body.
    @GET("/things/xVrP.json")
    Call<BaseResponse<List<SampleModel>>> getSampleModelList();

}

