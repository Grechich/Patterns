package com.grechich.com.builder.builders;

import com.grechich.com.builder.Car;

public class SportCarBuilder implements CarBuilder{

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public SportCarBuilder() {
    }

    @Override
    public CarBuilder fixChassis() {
        this.chassis = "Sport chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        this.body = "Sport body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        this.paint = "Sport red paint";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        this.interior = "Sport interior";
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
