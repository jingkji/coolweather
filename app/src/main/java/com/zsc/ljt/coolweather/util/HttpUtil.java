package com.zsc.ljt.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 发送网络请求
 * Created by _Li on 2017/5/3.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
