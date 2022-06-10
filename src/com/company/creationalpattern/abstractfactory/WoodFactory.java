package com.company.creationalpattern.abstractfactory;

import com.company.creationalpattern.abstractfactory.chair.Chair;
import com.company.creationalpattern.abstractfactory.chair.WoodChair;
import com.company.creationalpattern.abstractfactory.table.Table;
import com.company.creationalpattern.abstractfactory.table.WoodTable;

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
