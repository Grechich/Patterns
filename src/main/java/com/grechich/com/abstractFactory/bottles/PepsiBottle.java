package com.grechich.com.abstractFactory.bottles;

public class PepsiBottle implements Bottle{


    @Override
    public void breaks() {
        System.out.println("Pepsi bottle is broken");
    }
}
