package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.chair.Chair;
import com.company.creational.abstractfactory.chair.WoodChair;
import com.company.creational.abstractfactory.table.Table;
import com.company.creational.abstractfactory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
