package com.zzx.observe.Impl;

import com.zzx.observe.Observer;

public class SinaWebsite implements Observer {

    //温度 湿度 气压
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    public void display() {
        System.out.println("=====新浪网站=====" +
                "\n***新浪网站温度是：" + temperature +
                ", \n***新浪网站湿度是：" + humidity +
                ", \n***新浪网站气压是：" + pressure);
    }
}
