package com.grechich.com.abstractFactory;

import com.grechich.com.abstractFactory.bottles.Bottle;
import com.grechich.com.abstractFactory.cans.Can;
import com.grechich.com.abstractFactory.factories.ColaDrinksFactory;
import com.grechich.com.abstractFactory.factories.DrinksFactory;
import com.grechich.com.abstractFactory.factories.PepsiDrinksFactory;

public class Application {
    private Bottle bottle;
    private Can can;

    public Application(DrinksFactory factory){
        this.bottle = factory.createBottle();
        this.can = factory.createCan();
    }

    public void breaks(){
        bottle.breaks();
    }

    public void loksLike(){
        can.looksLike();
    }








}
