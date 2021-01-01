package com.uvsoftgroup.bp.uvsoftgroupjavabp.inheritanceexam;

public class GeoLocation {
	long id;
	double latCord;
	double lonCord;
	String cityName;
	String roadName;
	String houseNumber;
	String country;
	String county;

	public double calculateDistanceBetweenPoints(double x1, double y1, double x2, double y2) {
		if(x1>=0 && y1>=0 && x2>=0 && y2>=0 ){
			return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		}
		else{
			return 0.0;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getLatCord() {
		return latCord;
	}

	public void setLatCord(double latCord) {
		this.latCord = latCord;
	}

	public double getLonCord() {
		return lonCord;
	}

	public void setLonCord(double lonCord) {
		this.lonCord = lonCord;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	

}
