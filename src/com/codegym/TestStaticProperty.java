package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        //"Mazda 3","Skyactiv 3"
        //"Mazda 6","Skyactiv 6"
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(car1.getNumberOfCar());

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(car2.getNumberOfCar());
    }
}
