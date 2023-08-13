package com.zzx.observe.javaUtil;

import java.util.Observable;
import java.util.Observer;

public class SinaWebsite implements Observer {

    //温度 湿度 气压
    private Weather weather;

    public void update(float temperature, float humidity, float pressure) {

        this.display();
    }

    public void display() {
        System.out.println("=====新浪网站=====" +
                "\n***新浪网站温度是：" + weather.getTemperature() +
                ", \n***新浪网站湿度是：" + weather.getHumidity() +
                ", \n***新浪网站气压是：" + weather.getPressure());
    }

    @Override
    public void update(Observable o, Object arg) {
        this.weather = (Weather) arg;
        this.display();
    }
}
