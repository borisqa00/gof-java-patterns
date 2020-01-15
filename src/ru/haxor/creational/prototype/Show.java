package ru.haxor.creational.prototype;

public class Show implements PrototypeCapable {
    private String name = null;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Show clone() throws CloneNotSupportedException {
        System.out.println("Cloning show object");
        return (Show) super.clone();
    }

    @Override
    public String toString() {
        return "Show";
    }
}
