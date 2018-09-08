package com.finitebits.tracker.Module.Explore;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.finitebits.tracker.Repository.Model.Event;
import com.finitebits.tracker.Repository.EventRepository;

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
