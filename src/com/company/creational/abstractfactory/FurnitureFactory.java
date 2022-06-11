package com.company.creational.abstractfactory;

public class FurnitureFactory {
    private FurnitureFactory() {
    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case WOOD -> {
                return new WoodFactory();
            }

            case PLASTIC -> {
                return new PlasticFactory();
            }

            default -> {
                throw new UnsupportedOperationException("This furniture is unsupported");
            }
        }
    }
}
