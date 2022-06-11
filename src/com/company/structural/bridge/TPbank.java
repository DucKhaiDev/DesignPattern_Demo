package com.company.structural.bridge;

public class TPbank extends Bank {
    public TPbank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at TPbank is a ");
        account.openAccount();
    }
}
