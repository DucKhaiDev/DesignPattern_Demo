package com.company.structural.proxy.protection;

public class Main {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("admin", "Kai");
        admin.load();
        admin.insert();

        UserService customer = new UserServiceProxy("customer", "Khai");
        customer.load();
        customer.insert();
    }
}
