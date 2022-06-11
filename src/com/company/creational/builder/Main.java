package com.company.creational.builder;

import com.company.creational.builder.types.BreadType;
import com.company.creational.builder.types.OrderType;
import com.company.creational.builder.types.SauceType;

public class Main {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .breadType(BreadType.OMELETTE)
                .sauceType(SauceType.SOY_SAUCE)
                .build();
        System.out.println(order);
    }
}
