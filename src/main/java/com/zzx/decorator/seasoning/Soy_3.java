package com.zzx.decorator.seasoning;

import com.zzx.decorator.Decorator;
import com.zzx.decorator.Drink;

public class Soy_3 extends Decorator {


    public Soy_3(Drink drink) {
        super(drink);
        super.setDescription("豆浆");
        super.setPrice(3);
    }
}
