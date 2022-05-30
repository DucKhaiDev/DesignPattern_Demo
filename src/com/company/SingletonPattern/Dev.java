package com.company.SingletonPattern;

public class Dev {
    private String name;

    private Dev() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dev getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public String toString() {
        return name + " hello!";
    }

    private static class SingletonHelper {
        private static final Dev INSTANCE = new Dev();
    }
}
