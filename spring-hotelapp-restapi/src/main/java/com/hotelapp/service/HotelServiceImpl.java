package com.hotelapp.service;

import java.util.List;

import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;

public class HotelServiceImpl implements HotelService {

	
	HotelRepository hotelRepository;
	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public void update(Hotel hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public Hotel getHotelById(int hotelId) {

		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
		
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByDevivery(String partnerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
