package com.zzx.observe.original;

public class OriginalWeatherClient {
    public static void main(String[] args) {

        // 天气网站平台
        OriginalCurrentCondition webSiteOriginalCurrentCondition = new OriginalCurrentCondition();
        //气象台
        WeatherData weatherData = new WeatherData();

        // 天气网站接入气象台
        weatherData.setWebsiteConditions(webSiteOriginalCurrentCondition);
        //设置天气
        weatherData.setData(10.0f, 50f, 1);
        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);
    }
}
