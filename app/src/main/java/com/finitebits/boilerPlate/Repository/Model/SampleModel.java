package com.finitebits.boilerPlate.Repository.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by myorh on 06/09/2018.
 */

public class SampleModel {

    /*
    link to json generator http://www.objgen.com/json/models/pLd4
    https://www.jasonbase.com/things/wgqA/edit
    Sample Response data
  {
  "status": "success",
  "data": [
    {
      "name": "Latest Jamz",
      "data": [
        {
          "name": "Th cocktail dinner",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2018/08/18/18/42/emotions-3615255__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "Night burster",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2015/07/02/10/06/sparklers-828570__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "event13",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2015/03/26/10/08/dj-690986__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        }
      ]
    },
    {
      "name": "Trending",
      "data": [
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2015/05/15/14/50/concert-768722__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2015/09/02/13/04/marriage-918864__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2018/07/04/00/19/champagne-3515140__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        }
      ]
    },
    {
      "name": "group3",
      "data": [
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2017/01/09/02/02/pink-wine-1964457__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2015/09/02/13/26/glasses-919071__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        },
        {
          "name": "event1",
          "venue": "Just the description",
          "image_url": "https://cdn.pixabay.com/photo/2014/08/14/14/21/shish-kebab-417994__480.jpg",
          "description": "one party like that",
          "price": 200,
          "total_attendee": "300",
          "total_registered": 40,
          "date": "12-12-1108"
        }
      ]
    }
  ]
}
  */

    private String name;
    private String venue;
    private String date;

    @SerializedName("image_url")
    private String imageUrl;

    private String description;
    private int price;
    private int totalAttendee;

    public SampleModel(){
        this.price = 0;
    }


    public SampleModel(String name, String venue, String date, String imageUrl, String description, int price, int totalAttendee) {
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
