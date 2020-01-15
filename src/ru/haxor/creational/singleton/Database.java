package ru.haxor.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Database  {

    private static Database database;

    private Database() {}

    public static Database getInstance() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        if (database == null) {
            System.out.println("Instantiation db from thread" + Thread.currentThread().getId());
            database = new Database();
        }
        lock.unlock();
        return database;
    }

    public String getQuery() {
        return "Hey";
    }
}
