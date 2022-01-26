package com.grechich.com.abstractFactory.bottles;

public class ColaBottle implements Bottle{


    @Override
    public void breaks() {
        System.out.println("Cola bottle is broken");
    }
}
