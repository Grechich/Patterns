package com.grechich.com.abstractFactory.factories;

import com.grechich.com.abstractFactory.bottles.Bottle;
import com.grechich.com.abstractFactory.bottles.ColaBottle;
import com.grechich.com.abstractFactory.cans.Can;
import com.grechich.com.abstractFactory.cans.ColaCan;

public class ColaDrinksFactory implements DrinksFactory{
    @Override
    public Can createCan() {
        return new ColaCan();
    }

    @Override
    public Bottle createBottle() {
        return new ColaBottle();
    }
}
