package com.company.creationalpattern.singletonpattern;

public class Main {
    public static void main(String[] args) {
        BillPushSingleton singleton = BillPushSingleton.getInstance();
        System.out.println(singleton.getSingleton() + " " + singleton.hashCode());
        singleton.setSingleton("Edit");
        System.out.println(singleton.getSingleton() + " " + singleton.hashCode());
    }
}
