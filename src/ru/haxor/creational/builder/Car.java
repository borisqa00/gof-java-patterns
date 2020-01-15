package ru.haxor.creational.builder;

public class Car {
    private final String company;
    private final String color;
    private final String engine;
    private final int doors;

    public Car(CarBuilder carBuilder) {
        this.company = carBuilder.company;
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
        this.doors = carBuilder.doors;
    }

    public String getCompany() {
        return company;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car: " + this.company + ", " + this.color + ", " + this.engine + ", " + this.doors;
    }

    public static class CarBuilder {
        private final String company;
        private String engine;
        private final String color;
        private int doors;

        public CarBuilder(String company, String color) {
            this.company = company;
            this.color = color;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            Car car = new Car(this);
            // validate
            return car;
        }
    }
}
