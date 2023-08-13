package com.zzx.decorator;

import com.zzx.decorator.seasoning.Chocolate_1;
import com.zzx.decorator.seasoning.Milk_2;
import com.zzx.decorator.singleOriginCoffee.LongBlack_30;

public class CoffeeService {
    public static void main(String[] args) {
        // 点一份加巧克力和牛奶的 咖啡
        System.out.println("点一份加巧克力和牛奶的 咖啡");
        Chocolate_1 chocolate1 = new Chocolate_1(new Milk_2(new LongBlack_30()));
        System.out.println(chocolate1.getDescription());
        System.out.println(chocolate1.cost());

        System.out.println("点一份加牛奶和牛奶的 咖啡");
        Milk_2 milk2 = new Milk_2(new Milk_2(new LongBlack_30()));
        System.out.println(milk2.getDescription());
        System.out.println(milk2.cost());
    }
}
