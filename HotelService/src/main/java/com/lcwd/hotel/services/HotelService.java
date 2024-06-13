package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;
import java.util.ListResourceBundle;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);

}
