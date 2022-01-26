package com.grechich.com.builder.builders;

import com.grechich.com.builder.Car;

public class SmallCarBuilder implements CarBuilder{

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public SmallCarBuilder() {
    }

    @Override
    public CarBuilder fixChassis() {
        this.chassis = "Small chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        this.body = "Small body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        this.paint = "Yellow paint for Small car";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        this.interior = "Interior for Small car";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete. Can't deliver!");
        }
        return null;
    }
}
