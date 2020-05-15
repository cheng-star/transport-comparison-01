package com.cwfit.user;

import com.cwfit.transport.*;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/14 - 23:27
 */
public class Person {

        private int p_Age;
        private String p_Sex;
        private String id;
        private String p_Name;

        public Person() {
        }

        public Person(String describe) {
                System.out.println(describe);
        }

        public int getP_Age() {
                return p_Age;
        }

        public void setP_Age(int p_Age) {
                this.p_Age = p_Age;
        }

        public String getP_Sex() {
                return p_Sex;
        }

        public void setP_Sex(String p_Sex) {
                this.p_Sex = p_Sex;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getP_Name() {
                return p_Name;
        }

        public void setP_Name(String p_Name) {
                this.p_Name = p_Name;
        }

        @Override
        public String toString() {
                return "Person{" +
                        "p_Age=" + p_Age +
                        ", p_Sex='" + p_Sex + '\'' +
                        ", id='" + id + '\'' +
                        ", p_Name='" + p_Name + '\'' +
                        '}';
        }

        public void driveTransport(Aircraft aircraft, String ownership, String GPSPosition, Data dataOfPurchase){
                aircraft.setDataOfPurchase(dataOfPurchase);
                aircraft.setOwnership(ownership);
                aircraft.setGPSPosition(GPSPosition);

        }

        public void driveTransport(Airship airship,String ownership,String GPSPosition){
               Date data = new Date();
                airship.setDataOfPurchase(data);
                airship.setOwnership(ownership);
                airship.setGPSPosition(GPSPosition);
        }

        public void driveTransport(Automobile automobile,String ownership,String GPSPosition,Data dataOfPurchase){
                automobile.setDataOfPurchase(dataOfPurchase);
                automobile.setOwnership(ownership);
                automobile.setGPSPosition(GPSPosition);

        }
        public void driveTransport(Bicycle bicycle,String ownership,String GPSPosition,Data dataOfPurchase){
                bicycle.setDataOfPurchase(dataOfPurchase);
                bicycle.setOwnership(ownership);
                bicycle.setGPSPosition(GPSPosition);

        }
        public void driveTransport(HotAirBalloon hotAirBalloon,String ownership,String GPSPosition,Data dataOfPurchase){

                hotAirBalloon.setDataOfPurchase(dataOfPurchase);
                hotAirBalloon.setOwnership(ownership);
                hotAirBalloon.setGPSPosition(GPSPosition);
        }

        public void driveTransport(Motorcycle motorcycle,String ownership,String GPSPosition,Data dataOfPurchase){
                motorcycle.setDataOfPurchase(dataOfPurchase);
                motorcycle.setOwnership(ownership);
                motorcycle.setGPSPosition(GPSPosition);
        }

        public void driveTransport(Ship ship,String ownership,String GPSPosition,Data dataOfPurchase){

                ship.setDataOfPurchase(dataOfPurchase);
                ship.setOwnership(ownership);
                ship.setGPSPosition(GPSPosition);
        }

        public void driveTransport(Submarine submarine,String ownership,String GPSPosition,Data dataOfPurchase){
                submarine.setDataOfPurchase(dataOfPurchase);
                submarine.setOwnership(ownership);
                submarine.setGPSPosition(GPSPosition);
        }
}
