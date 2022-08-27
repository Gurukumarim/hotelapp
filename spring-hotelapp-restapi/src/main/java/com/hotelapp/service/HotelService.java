package com.hotelapp.service;



import java.util.List;

import com.hotelapp.models.Hotel;

public interface HotelService {
	
	void addHotel(Hotel hotel);
	void update(Hotel hotel);
	Hotel getHotelById(int hotelId);
	void deleteHotel(int hotelId);
	
	List<Hotel> getHotelsByCity(String city);
	List<Hotel> getHotelsByMenu(String menuName);
	List<Hotel> getHotelsByDevivery(String partnerName);
	List<Hotel> getHotelsByLocation(String city);
	List<Hotel> getHotelsByLocationAndMenu(String location ,String menuName);
	

}
