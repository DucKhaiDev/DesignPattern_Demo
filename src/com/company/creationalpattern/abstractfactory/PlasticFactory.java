package com.company.creationalpattern.abstractfactory;

import com.company.creationalpattern.abstractfactory.chair.Chair;
import com.company.creationalpattern.abstractfactory.chair.PlasticChair;
import com.company.creationalpattern.abstractfactory.table.PlasticTable;
import com.company.creationalpattern.abstractfactory.table.Table;

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
