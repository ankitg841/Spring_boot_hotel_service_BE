package com.lcwd.hotel.repositories;

import com.lcwd.hotel.entities.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel,Integer> {

}
