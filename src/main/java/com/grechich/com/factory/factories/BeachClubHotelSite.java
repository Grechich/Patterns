package com.grechich.com.factory.factories;

import com.grechich.com.factory.hotels.BeachClubHotel;
import com.grechich.com.factory.hotels.Hotel;

public class BeachClubHotelSite extends HotelSite{
    @Override
    public Hotel createHotel() {
        return new BeachClubHotel();
    }
}
