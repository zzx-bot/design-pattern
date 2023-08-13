package com.zzx.decorator.seasoning;

import com.zzx.decorator.Decorator;
import com.zzx.decorator.Drink;

public class Milk_2 extends Decorator {

    public Milk_2(Drink drink) {
        super(drink);
        super.setDescription("牛奶");
        super.setPrice(2);
    }
}
