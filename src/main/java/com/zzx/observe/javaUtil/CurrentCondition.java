package com.zzx.observe.javaUtil;


import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Observer {

    //温度 湿度 气压
    private Weather weather;

    public void update(float temperature, float humidity, float pressure) {

        this.display();
    }

    public void display() {
        System.out.println("=====当前天气；=====" +
                "\n***百当前温度是：" + weather.getTemperature() +
                ", \n***当前湿度是：" + weather.getHumidity() +
                ", \n***当前气压是：" + weather.getPressure());
    }

    @Override
    public void update(Observable o, Object arg) {
        this.weather = (Weather) arg;
        this.display();
    }
}
