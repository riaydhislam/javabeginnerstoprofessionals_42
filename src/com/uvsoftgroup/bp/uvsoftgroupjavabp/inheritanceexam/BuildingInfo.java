package com.uvsoftgroup.bp.uvsoftgroupjavabp.inheritanceexam;

public class BuildingInfo{
	long buId;
	String type;
	double length;
	double wide;
	GeoLocation geoLocation;

	// default constructor
	public BuildingInfo() {
		super();
	}
	// parameterize constructors
	public BuildingInfo(long buId, String type, double length, double wide) {
		super();
		this.buId = buId;
		this.type = type;
		this.length = length;
		this.wide = wide;
	}


	public BuildingInfo(long buId, String type, double length, double wide, GeoLocation geoLocation) {
		super();
		this.buId = buId;
		this.type = type;
		this.length = length;
		this.wide = wide;
		this.geoLocation = geoLocation;
	}
	
	public double areaCalculation(double l, double w) {
		return l * w;
	}


	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}
		
	public double priceCalculation(String type, double l, double w) {
		if(!type.isEmpty()){
			if(type.equalsIgnoreCase("R")){
				return areaCalculation(l,w)*10000.00;
				}
				else if(type.equalsIgnoreCase("C")){
					return areaCalculation(l,w)*20000.00;
				}
				else if(type.equalsIgnoreCase("I")){
					return areaCalculation(l,w)*5000.00;
				}
				else if(type.equalsIgnoreCase("M")){
					return areaCalculation(l,w)*15000.00;
				}
				else{
					return areaCalculation(l,w)*25000.00;
				}
		   }
		else{
			return 0.0;
		}
	}
	

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
	public long getBuId() {
		return buId;
	}

	public void setBuId(long buId) {
		this.buId = buId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWide() {
		return wide;
	}

	public void setWide(double wide) {
		this.wide = wide;
	}
	@Override
	public String toString() {
		return "BuildingInfo [buId=" + buId + ", type=" + type + ", length=" + length + ", wide=" + wide + "]";
	}

	
}
