package com.zsc.ljt.coolweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by _Li on 2017/5/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatheId;

    public Update updata;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
