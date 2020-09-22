package com.java.builder;


public class BuilderPractice {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar.Helper("Toyota").setColor("black").setMaxSpeed(300).build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
    }
}

class SportCar {

    private String name;
    private int maxSpeed;
    private String color;

    private SportCar(Helper helper) {
        this.name = helper.name;
        this.maxSpeed = helper.maxSpeed;
        this.color = helper.color;
    }


    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }


    static class Helper {
        public Helper(String name) {
            this.name = name;
        }

        public Helper setColor(String color) {
            this.color = color;
            return this;
        }

        public Helper setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }

        private String name;
        private int maxSpeed;
        private String color;
    }
}


