package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r=new RWOnly();
//        r.name="Chirag";
//        System.out.println(r.name);
//        java: name has private access in com.driver.RWOnly
        r.setName("Chirag");
        System.out.println(r.getName());
    }
}