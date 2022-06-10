package com.company.creationalpattern.abstractfactory.table;

import com.company.creationalpattern.abstractfactory.FurnitureAbstractFactory;
import com.company.creationalpattern.abstractfactory.FurnitureFactory;
import com.company.creationalpattern.abstractfactory.MaterialType;
import com.company.creationalpattern.abstractfactory.chair.Chair;

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
