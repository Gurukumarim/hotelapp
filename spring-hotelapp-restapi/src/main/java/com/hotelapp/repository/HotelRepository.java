package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelapp.models.Hotel;

public interface HotelRepository  extends JpaRepository<Hotel, Integer>{

}
