package com.zzx.decorator.seasoning;

import com.zzx.decorator.Decorator;
import com.zzx.decorator.Drink;

public class Chocolate_1 extends Decorator {
    public Chocolate_1(Drink drink) {
        super(drink);
        super.setDescription("巧克力");
        super.setPrice(1);
    }
}
