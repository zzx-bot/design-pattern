package com.zzx.observe.javaUtil;


public class WeatherClient {
    public static void main(String[] args) {

        // 百度网平台
        BaiduWebsite baiduWebsite = new BaiduWebsite();
        // 新浪网平台
        SinaWebsite sinaWebsite = new SinaWebsite();

        // 新浪网平台
        CurrentCondition currentCondition = new CurrentCondition();
        //气象台
        WeatherData weatherData = new WeatherData();

        // 观察者网站接入气象台
        weatherData.addObserver(baiduWebsite);
        weatherData.addObserver(sinaWebsite);
        weatherData.addObserver(currentCondition);

        //设置天气
        //测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.notifyObservers(new Weather(10f, 50f, 100));

        //测试
        weatherData.deleteObserver(currentCondition);
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.notifyObservers(new Weather(20f, 70f, 100));

    }
}
