package com.zsc.ljt.coolweather.gson;

/**
 * Created by _Li on 2017/5/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
