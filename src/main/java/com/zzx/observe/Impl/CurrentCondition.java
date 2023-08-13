package com.zzx.observe.Impl;

import com.zzx.observe.Observer;

public class CurrentCondition implements Observer {

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
        System.out.println("气象台当前天气：" +
                "\n大气温度是：" + temperature +
                ", \n大气湿度是：" + humidity +
                ", \n大气压力是：" + pressure);
    }
}
