package com.company.creational.abstractfactory.table;

import com.company.creational.abstractfactory.FurnitureAbstractFactory;
import com.company.creational.abstractfactory.FurnitureFactory;
import com.company.creational.abstractfactory.MaterialType;
import com.company.creational.abstractfactory.chair.Chair;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair = factory.createChair();
        chair.create();

        factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Table table = factory.createTable();
        table.create();
    }
}
