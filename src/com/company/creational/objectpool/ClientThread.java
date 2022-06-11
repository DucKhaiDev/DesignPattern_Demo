package com.company.creational.objectpool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ClientThread implements Runnable {
    private TaxiPool taxiPool;

    public ClientThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeTaxi();
    }

    private void takeTaxi() {
        try {
            System.out.println("New client: " + Thread.currentThread().getName());
            Taxi taxi = taxiPool.getTaxi();

            TimeUnit.MILLISECONDS.sleep(randInt(1000, 1500));

            taxiPool.release(taxi);
            System.out.println("Served taxi client: " + Thread.currentThread().getName());
        } catch (InterruptedException | TaxiNotFoundException e){
            System.out.println(">>>Rejected the client: " + Thread.currentThread().getName());
        }
    }

    public static int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
