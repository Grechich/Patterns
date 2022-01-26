package com.grechich.com.abstractFactory.factories;

import com.grechich.com.abstractFactory.bottles.Bottle;
import com.grechich.com.abstractFactory.bottles.PepsiBottle;
import com.grechich.com.abstractFactory.cans.Can;
import com.grechich.com.abstractFactory.cans.PepsiCan;

public class PepsiDrinksFactory implements DrinksFactory{
    @Override
    public Can createCan() {
        return new PepsiCan();
    }

    @Override
    public Bottle createBottle() {
        return new PepsiBottle();
    }
}
