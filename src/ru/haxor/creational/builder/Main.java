package ru.haxor.creational.builder;

public class Main {
    public static void main(String[] args) {
        User userOne = new User.UserBuilder("Boris", "Makaev")
                .age(23)
                .phone("213-123-32")
                .address("inno")
                .build();
        System.out.println(userOne);

        Car carOne = new Car.CarBuilder("BMW", "Blue")
                .doors(4)
                .engine("v4")
                .build();
        System.out.println(carOne);
    }
}
