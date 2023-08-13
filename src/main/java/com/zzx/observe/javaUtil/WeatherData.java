package com.zzx.observe.javaUtil;

import java.util.Observable;
import java.util.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 CurrentConditions 对象
 * 3. 当数据有更新时，就主动的调用 CurrentConditions 对象 update 方法(含 display), 这样他们（接入方）就看
 * 到最新的信息
 *
 * @author Administrator
 */
public class WeatherData extends Observable {

    private Weather weather;


    // 当数据有更新时，就调用 setData
    public void notifyObservers(Weather weather) {
        super.setChanged();
        super.notifyObservers(weather);
    }


}
