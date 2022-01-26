package com.grechich.com.factory.factories;

import com.grechich.com.factory.hotels.Hotel;

public abstract class HotelSite {
    public void roomBooking() {
        Hotel hotel = createHotel();
        hotel.seeDetails();
        hotel.goToSite();
        hotel.book();
    }

    public abstract Hotel createHotel();
}
