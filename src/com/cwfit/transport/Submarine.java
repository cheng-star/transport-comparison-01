package com.cwfit.transport;

import javax.xml.crypto.Data;

/**
 * @author yeyike
 * @date 2020/5/14 - 23:26
 */
public class Submarine {
    private String ownership;
    private String GPSPosition;
    private Data dataOfPurchase;
    private String price = "21000000$";
    private String id = "090";

    public Submarine() {
    }

    public Submarine(String describe) {
        System.out.println(describe);
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public Data getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Data dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }
    public void drivingMethod(){
        System.out.println("潜浮");
    }
}
