package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.chair.Chair;
import com.company.creational.abstractfactory.chair.PlasticChair;
import com.company.creational.abstractfactory.table.PlasticTable;
import com.company.creational.abstractfactory.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
