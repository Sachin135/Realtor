package com.realtor;

import java.util.Date;

public class HouseDetails {

	private String listingID ;
	private String realtorID ;
	private String address ;
	private String city ;
	private Float cost ;
	private Date statusDate ;
	private Integer yearBuilt ;
	private String question ;
	
	public HouseDetails()
	{
		
	}
	
	
	public HouseDetails(String listingID, String realtorID, String address, String city, Float cost, Date statusDate,
			Integer yearBuilt, String question) {
		super();
		this.listingID = listingID;
		this.realtorID = realtorID;
		this.address = address;
		this.city = city;
		this.cost = cost;
		this.statusDate = statusDate;
		this.yearBuilt = yearBuilt;
		this.question = question;
	}
	public String getListingID() {
		return listingID;
	}
	public void setListingID(String listingID) {
		this.listingID = listingID;
	}
	public String getRealtorID() {
		return realtorID;
	}
	public void setRealtorID(String realtorID) {
		this.realtorID = realtorID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public Integer getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(Integer yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "HouseDetails [listingID=" + listingID + ", realtorID=" + realtorID + ", address=" + address + ", city="
				+ city + ", cost=" + cost + ", statusDate=" + statusDate + ", yearBuilt=" + yearBuilt + ", question="
				+ question + "]";
	}
	
	
	
	
}
