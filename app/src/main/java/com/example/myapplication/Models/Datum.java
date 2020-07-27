package com.example.myapplication.Models;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Datum {

    private String title;
    private String item;
    private String date;
    private String hour;
    private String img;

    public Datum(JSONObject a)throws JSONException{
        title = a.getString("title").toString();
        item = a.getString("item").toString();
        date = a.getString("date").toString();
        hour = a.getString("hour").toString();
        img = a.getString("img").toString();
    }

    public static ArrayList<Datum> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Datum> data = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            data.add(new Datum(datos.getJSONObject(i)));
        }
        return data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
