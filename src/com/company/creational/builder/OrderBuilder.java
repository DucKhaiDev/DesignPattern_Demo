package com.company.creational.builder;

import com.company.creational.builder.types.BreadType;
import com.company.creational.builder.types.OrderType;
import com.company.creational.builder.types.SauceType;
import com.company.creational.builder.types.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder breadType(BreadType breadType);

    OrderBuilder sauceType(SauceType sauceType);

    OrderBuilder vegetableType(VegetableType vegetableType);

    Order build();
}
