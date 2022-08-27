package com.hotelapp.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Delivery {

	private Integer deliveryId;
	private String partnerName;
	private double  charges;
	@ManyToMany(mappedBy = "delivery")
	private Set<Hotel>hotelList=new HashSet<>();
	public Delivery(String partnerName, double charges) {
		super();
		this.partnerName = partnerName;
		this.charges = charges;
	}
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public Set<Hotel> getHotelList() {
		return hotelList;
	}
	public void setHotelList(Set<Hotel> hotelList) {
		this.hotelList = hotelList;
	}
	@Override
	public String toString() {
		return "Delivery [partnerName=" + partnerName + ", charges=" + charges + ", hotelList=" + hotelList + "]";
	}
	
	
	
}
