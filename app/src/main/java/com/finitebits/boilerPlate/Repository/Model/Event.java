package com.finitebits.boilerPlate.Repository.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by myorh on 06/09/2018.
 */

public class Event {

    private String name;
    private String venue;

    private String date;

    @SerializedName("image_url")
    private String imageUrl;
    private String description;
    private int price;
    private int totalAttendee;

    public Event(){
        this.price = 0;
    }


    public Event(String name, String venue, String date, String imageUrl, String description, int price, int totalAttendee) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.imageUrl = imageUrl;
        this.description = description;
        this.price = price;
        this.totalAttendee = totalAttendee;
    }

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalAttendee() {
        return totalAttendee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTotalAttendee(int totalAttendee) {
        this.totalAttendee = totalAttendee;
    }
}
