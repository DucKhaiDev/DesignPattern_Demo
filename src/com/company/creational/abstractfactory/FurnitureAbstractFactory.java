package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.chair.Chair;
import com.company.creational.abstractfactory.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
