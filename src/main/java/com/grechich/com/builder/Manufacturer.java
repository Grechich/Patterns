package com.grechich.com.builder;

import com.grechich.com.builder.builders.CarBuilder;


public class Manufacturer {
    private CarBuilder carBuilder;

    public Manufacturer (CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car manufactureCar(){
        return carBuilder.fixChassis().fixBody().paint().fixInterior().build();
    }


}
