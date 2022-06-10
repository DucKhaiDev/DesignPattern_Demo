package com.company.creationalpattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        Bank bidv = BankFactory.getBank(BankType.BIDV);
        System.out.println(bidv.getBankName());

        Bank agribank = BankFactory.getBank(BankType.AGRIBANK);
        System.out.println(agribank.getBankName());
    }
}
