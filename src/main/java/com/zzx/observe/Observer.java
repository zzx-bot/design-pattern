package com.zzx.observe;

public interface Observer {
    //更新 温度 湿度 气压
    void update(float temperature, float humidity, float pressure);
}
