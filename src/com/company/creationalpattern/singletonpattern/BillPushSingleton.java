package com.company.creationalpattern.singletonpattern;

public class BillPushSingleton {
    private String singleton;

    private BillPushSingleton(){
        this.singleton = "This is singleton pattern";
    }

    public String getSingleton() {
        return singleton;
    }

    public void setSingleton(String singleton) {
        this.singleton = singleton;
    }

    public static BillPushSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private final static BillPushSingleton INSTANCE = new BillPushSingleton();
    }
}
