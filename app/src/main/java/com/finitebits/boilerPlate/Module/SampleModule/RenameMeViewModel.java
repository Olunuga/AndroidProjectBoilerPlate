package com.finitebits.boilerPlate.Module.SampleModule;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.finitebits.boilerPlate.Repository.Model.SampleModel;
import com.finitebits.boilerPlate.Repository.SampleModelRepository;

import java.util.List;

/**
 * Created by myorh on 08/09/2018.
 */

public class RenameMeViewModel extends ViewModel {
    private LiveData<List<SampleModel>> events;
    private SampleModelRepository sampleModelRepository;

    public RenameMeViewModel(){
        this.sampleModelRepository = SampleModelRepository.getINSTANCE();
    }


    public LiveData<List<SampleModel>> getEvents(){
      return sampleModelRepository.getEvents();
    }

}
