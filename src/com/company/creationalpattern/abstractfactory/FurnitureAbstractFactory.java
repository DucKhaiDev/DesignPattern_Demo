package com.company.creationalpattern.abstractfactory;

import com.company.creationalpattern.abstractfactory.chair.Chair;
import com.company.creationalpattern.abstractfactory.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
