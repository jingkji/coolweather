package com.zsc.ljt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by _Li on 2017/5/3.
 */

public class Weather {

    public String status;       //接口状态
    public Basic basic;         //基本信息
    public AQI aqi;             //空气质量
    public Now now;             //当前天气信息
    public Suggestion suggestion;       //相关建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;     //未来天气信息
}
