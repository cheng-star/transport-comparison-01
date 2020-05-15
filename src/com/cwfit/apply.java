package com.cwfit;

import com.cwfit.transport.Airship;
import com.cwfit.user.Person;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:00
 */
public class apply {

    public static void main(String[]args){

        Person person = new Person("一个工程师");
        Airship airship = new Airship("必要时，飞艇能在那里停留数天以躲避危险。");
        person.setId("007");
        person.setP_Age(19);
        person.setP_Name("Aoury");
        person.setP_Sex("男");
        person.driveTransport(airship,"Aoury","shanghai");
        System.out.println(person.toString());

        System.out.println(airship.toString());


    }
}
