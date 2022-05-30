package com.company.SingletonPattern;

public class Dev {
    private Dev(){
    }

    public static Dev getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final Dev INSTANCE = new Dev();
    }
}
