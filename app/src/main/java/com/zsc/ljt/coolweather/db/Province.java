package com.zsc.ljt.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by _Li on 2017/5/3.
 */

public class Province extends DataSupport {

    private int id;                 // 该实体类的id，该id代表Province
    private String provinceName;    // 省的名字，对应JSON数据的"name"
    private int provinceCode;       // 省的代号，对应JSON数据的"id"

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
