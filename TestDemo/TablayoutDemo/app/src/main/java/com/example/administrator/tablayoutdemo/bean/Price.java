package com.example.administrator.tablayoutdemo.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Price implements Serializable {

    /**现价*/
    @SerializedName("current")
    public double current;

    /**原价*/
    @SerializedName("prime")
    public double prime;
    
}
