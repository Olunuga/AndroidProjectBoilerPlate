package com.finitebits.boilerPlate.Module.Explore;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.finitebits.boilerPlate.Repository.Model.Event;
import com.finitebits.boilerPlate.Repository.EventRepository;

import java.util.List;

/**
 * Created by myorh on 08/09/2018.
 */

public class EventViewModel extends ViewModel {
    private LiveData<List<Event>> events;
    private EventRepository eventRepository;

    public EventViewModel(){
        this.eventRepository = EventRepository.getINSTANCE();
    }


    public LiveData<List<Event>> getEvents(){
      return eventRepository.getEvents();
    }

}
