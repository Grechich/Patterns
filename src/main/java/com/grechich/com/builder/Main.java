package com.grechich.com.builder;

import com.grechich.com.builder.builders.BigCarBuilder;
import com.grechich.com.builder.builders.CarBuilder;
import com.grechich.com.builder.builders.SmallCarBuilder;
import com.grechich.com.builder.builders.SportCarBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SmallCarBuilder();
        CarBuilder builder1 = new SportCarBuilder();
        CarBuilder builder2 = new BigCarBuilder();

        Manufacturer manufacturer = new Manufacturer(builder);
        Car car = manufacturer.manufactureCar();
        System.out.println(car);
    }


}
