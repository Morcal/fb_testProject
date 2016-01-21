package com.example.administrator.tablayoutdemo.bean;

import com.google.gson.annotations.SerializedName;

public class BaseObject {
    
    @SerializedName("title")
    public String title;
    
    @SerializedName("id")
    public int id;
    
    @SerializedName("desc")
    public String desc;
    
    @SerializedName("img")
    public Image img;
}
