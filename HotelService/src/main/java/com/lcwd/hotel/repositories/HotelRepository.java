package com.lcwd.hotel.repositories;

import com.lcwd.hotel.entities.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel,String> {

}
