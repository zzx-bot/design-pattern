package com.zzx.principle.singleresponsibility01;

public class SingleResponsibility1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

//交通工具不满足单一职责原则
class Vehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "在公路上飞驰......");
    }
}
