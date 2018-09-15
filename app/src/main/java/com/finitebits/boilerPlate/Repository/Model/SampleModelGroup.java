package com.finitebits.boilerPlate.Repository.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by myorh on 06/09/2018.
 */

public class SampleModelGroup {

    private String name;
    private String seemMore;

    @SerializedName("data")
    private List<SampleModel> sampleModelList;

    public SampleModelGroup() {
    }

    public SampleModelGroup(String name, String seemMore, List<SampleModel> sampleModelList) {
        this.name = name;
        this.seemMore = seemMore;
        this.sampleModelList = sampleModelList;
    }

    public String getName() {
        return name;
    }

    public String getSeemMore() {
        return seemMore;
    }

    public List<SampleModel> getSampleModelList() {
        return sampleModelList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeemMore(String seemMore) {
        this.seemMore = seemMore;
    }

    public void setSampleModelList(List<SampleModel> sampleModelList) {
        this.sampleModelList = sampleModelList;
    }
}
