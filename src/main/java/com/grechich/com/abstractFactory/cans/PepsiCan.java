package com.grechich.com.abstractFactory.cans;

public class PepsiCan implements Can{

    @Override
    public void looksLike() {
        System.out.println("Looks like Pepsi can");
    }
}
