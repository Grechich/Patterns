package com.grechich.com.factory.hotels;

public class SpaResort implements Hotel{
    @Override
    public void seeDetails() {
        System.out.println("Spa Resort Hotel");
    }

    @Override
    public void book() {
        System.out.println("You have booked Spa Resort Hotel");
    }

    @Override
    public void goToSite() {
        System.out.println("Here is Spa Resort Hotel site");
    }
}
