package com.zzx.decorator;

public abstract class Drink {
    //描述
    private String description;

    //价格
    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //子类实现
    public abstract float cost();
}
