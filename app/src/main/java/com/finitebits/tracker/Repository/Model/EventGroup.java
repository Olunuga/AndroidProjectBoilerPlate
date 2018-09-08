package com.finitebits.tracker.Repository.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by myorh on 06/09/2018.
 */

public class EventGroup {

    private String name;
    private String seemMore;


    private List<Event> eventList;

    public EventGroup() {
    }

    public EventGroup(String name, String seemMore, List<Event> eventList) {
        this.name = name;
        this.seemMore = seemMore;
        this.eventList = eventList;
    }

    public String getName() {
        return name;
    }

    public String getSeemMore() {
        return seemMore;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeemMore(String seemMore) {
        this.seemMore = seemMore;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
