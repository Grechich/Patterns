package com.grechich.com.factory.hotels;

public class DeepForestHotel implements Hotel{
    @Override
    public void seeDetails() {
        System.out.println("Deep Forest Hotel");
    }

    @Override
    public void book() {
        System.out.println("You have booked Deep Forest Hotel");
    }

    @Override
    public void goToSite() {
        System.out.println("Here is Deep Forest Hotel site");
    }
}
