package com.company.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Bank vietcombank = new Vietcombank(new CheckingAccount());
        vietcombank.openAccount();

        Bank tpbank = new TPbank(new CheckingAccount());
        tpbank.openAccount();
    }
}
