package com.pojo;

public class Province {
    private int ID;
    private int provinceID;
    private String province;

    public Province(int ID, int provinceID, String province) {
        this.ID = ID;
        this.provinceID = provinceID;
        this.province = province;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Province() {
    }
}
