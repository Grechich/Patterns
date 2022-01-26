package com.grechich.com.builder.builders;

import com.grechich.com.builder.Car;

public interface CarBuilder {
    CarBuilder fixChassis();
    CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();
    Car build();
}
