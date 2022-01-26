package com.grechich.com.factory.hotels;

public class BeachClubHotel implements Hotel{
    @Override
    public void seeDetails() {
        System.out.println("Beach Club Hotel");
    }

    @Override
    public void book() {
        System.out.println("You have booked Beach Club Hotel");
    }

    @Override
    public void goToSite() {
        System.out.println("Here is Beach Club Hotel site");
    }
}
