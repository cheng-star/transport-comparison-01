package com.cwfit.transport;

import sun.util.calendar.BaseCalendar;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/14 - 23:27
 */
public class Airship {

    private String ownership;
    private String GPSPosition;
    private Date dataOfPurchase;
    private String price = "9000000$";
    private String id = "020";

    public Airship() {
    }

    public Airship(String describe) {

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

    public  Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }



    public void drivingMethod(){
        System.out.println("飞行");
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return "Airship{" +
                "ownership='" + ownership + '\'' +
                ", GPSPosition='" + GPSPosition + '\'' +
                ", dataOfPurchase=" + format.format(dataOfPurchase) +
                ", price='" + price + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
