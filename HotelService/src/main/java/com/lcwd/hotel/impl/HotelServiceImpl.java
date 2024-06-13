package com.lcwd.hotel.impl;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Iterable<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(Integer id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel is not found by the Specific id !! "+id));
    }
}
