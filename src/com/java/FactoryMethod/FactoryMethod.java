package com.java.FactoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {
        Car car = Car.create();
    }


    static class Car {
        public Car() {
        }

        public static Car create() {
            System.out.println("You have created new Car");
            return new Car();
        }
    }
}
