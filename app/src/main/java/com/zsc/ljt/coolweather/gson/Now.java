package com.zsc.ljt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by _Li on 2017/5/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
