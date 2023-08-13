package com.zzx.observe.original;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 CurrentConditions 对象
 * 3. 当数据有更新时，就主动的调用 CurrentConditions 对象 update 方法(含 display), 这样他们（接入方）就看
 * 到最新的信息
 *
 * @author Administrator
 */
public class WeatherData {
    //温度 湿度 气压
    private float temperature;
    private float humidity;
    private float pressure;
    //气象网站
    private OriginalCurrentCondition WebsiteConditions;

    public OriginalCurrentCondition getWebsiteConditions() {
        return WebsiteConditions;
    }

    public void setWebsiteConditions(OriginalCurrentCondition websiteConditions) {
        WebsiteConditions = websiteConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用 dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void dataChange() {
        WebsiteConditions.update(getTemperature(), getHumidity(), getPressure());
    }
}
