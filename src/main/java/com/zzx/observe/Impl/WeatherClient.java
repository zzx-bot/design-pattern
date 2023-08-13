package com.zzx.observe.Impl;


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
        weatherData.registerObserver(baiduWebsite);
        weatherData.registerObserver(sinaWebsite);
        weatherData.registerObserver(currentCondition);


        //设置天气
        //测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
        weatherData.removeObserver(currentCondition);
        //测试
        System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 10.3f);
    }
}
