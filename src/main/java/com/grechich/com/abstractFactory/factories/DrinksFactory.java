package com.grechich.com.abstractFactory.factories;

import com.grechich.com.abstractFactory.bottles.Bottle;
import com.grechich.com.abstractFactory.cans.Can;

public interface DrinksFactory {
    Can createCan();
    Bottle createBottle();
}
