package com.company.creationalpattern.factorymethod;

public class BankFactory {
    private BankFactory() {
    }

    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case BIDV -> {
                return new BIDV();
            }
            case AGRIBANK -> {
                return new Agribank();
            }
            default -> throw new IllegalArgumentException("This bank type is unsupported!");
        }
    }
}
