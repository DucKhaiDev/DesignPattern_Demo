package com.company.structural.facade;

public class Main {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("duckhaidev@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("duckhaidev@gmail.com", "84982523005");
    }
}
