package ru.haxor.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-- Starting thread: " + Thread.currentThread().getId());
                Database db = Database.getInstance();
                System.out.println(db.getQuery());
            }
        });

        int a = 10;
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-- Starting thread: " + Thread.currentThread().getId() + " " + a);
                Database db = Database.getInstance();
                System.out.println(db.getQuery());
            }
        });

        t1.start();
        t2.start();


    }
}
