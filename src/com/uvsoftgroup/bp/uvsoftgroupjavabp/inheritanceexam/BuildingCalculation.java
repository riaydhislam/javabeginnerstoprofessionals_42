package com.uvsoftgroup.bp.uvsoftgroupjavabp.inheritanceexam;

public class BuildingCalculation extends BuildingInfo {
	private long id;
	private double price;

	 
	// constructors methods
	
	public BuildingCalculation() {
			super();
		}
	public BuildingCalculation(long id, double price, String type) {
		super();
		this.id = id;
		this.price = price;
		this.type = type;
	}
	
	public BuildingCalculation(long id, GeoLocation geoLocation) {
		super();
		this.id = id;
		this.geoLocation = geoLocation;
	}
	

	public BuildingCalculation(long buId, String type, double length, double wide) {
		super(buId, type, length, wide);
	}
	
	public BuildingCalculation(long buId, String type, double length, double wide, double price) {
		super(buId, type, length, wide);
		this.price = price;
	}
	
	
    /**
     * 
     * @param calculationType
     * @param l
     * @param w
     * @return double
     */
	public double areaCalculation(String calculationType, double l, double w) {
		
		if(!calculationType.isEmpty()){
			if(calculationType.equalsIgnoreCase("B")){
				return super.areaCalculation(l, w);
			}
			else if (calculationType.equalsIgnoreCase("F")){
				return super.areaCalculation(l, w);
			}
			else if (calculationType.equalsIgnoreCase("U")){
				return super.areaCalculation(l, w);
			}
			else{
				return 0.0;
			}
		}
		else{
			return 0.0;
		}
		
	}
	
    /**
     * 
     * @param calculationType
     * @param l
     * @param w
     * @return double
     */
	public double areaCalculationFromBuildingType(double l, double w) {
		
			if(super.type.equals("R")){
				return super.areaCalculation(l, w)+20.00;
			}
			else if (super.type.equals("C")){
				return super.areaCalculation(l, w)+30.00;
			}
			else if (super.type.equals("I")){
				return areaCalculation(l, w)+40.00;
			}
			else{
				return 0.0;
			}
		
	
	}
	

    /**
     * 
     * @param calCulationType
     * @param l
     * @param w
     * @param h
     * @return double
     */
	public double volumnCalculation(String calCulationType, double l, double w, double h) {
		
		if(!calCulationType.isEmpty()){
			if(super.type.equals(calCulationType)){
				return areaCalculation(l, w)*h;
			}
			else{
				return 0.0;
			}
		}
		else{
			return 0.0;
		}
		
	}
	/**
	 * 	
	 */
	public double priceCalculation(String type, double l, double w) {
		return super.priceCalculation(type, l, w);
	}
	
   
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BuildingInfoCalculation [id=" + id + ", price=" + price + ", type=" + type + "]";
	}


}
