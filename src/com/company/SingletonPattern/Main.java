package com.company.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Dev dev_1 = Dev.getInstance();
        Dev dev_2 = Dev.getInstance();
        System.out.println(dev_1.hashCode());
        System.out.println(dev_2.hashCode());
    }
}
