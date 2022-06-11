package com.company.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Window 10", "Word 2003", "BKAV", "Chrome v69", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);
    }
}