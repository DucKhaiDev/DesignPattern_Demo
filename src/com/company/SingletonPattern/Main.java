package com.company.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Dev dev_1 = Dev.getInstance();
        dev_1.setName("Dev 1");
        System.out.println(dev_1 + " - " + dev_1.hashCode());

        Dev dev_2 = Dev.getInstance();
        dev_2.setName("Dev 2");
        System.out.println(dev_2 + " - " + dev_2.hashCode());
    }
}
