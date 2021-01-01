package com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm;

public abstract class BuildingInfo implements IBuildingInfo {
	long buId;
	String type;
	double length;
	double wide;

	// abstract methods
	public abstract double areaCalculation(double l, double w);

	public abstract double volumnCalculation(double l, double w, double h);

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

	public double priceCalculationLocal(BuildingInfo buildingInfo) {
		if(!buildingInfo.type.isEmpty()){
			if(buildingInfo.type.equalsIgnoreCase("R")){
				return areaCalculation(buildingInfo.length,buildingInfo.wide)*10000.00;
				}
				else if(buildingInfo.type.equalsIgnoreCase("C")){
					return areaCalculation(buildingInfo.length,buildingInfo.wide)*20000.00;
				}
				else if(buildingInfo.type.equalsIgnoreCase("I")){
					return areaCalculation(buildingInfo.length,buildingInfo.wide)*5000.00;
				}
				else if(buildingInfo.type.equalsIgnoreCase("M")){
					return areaCalculation(buildingInfo.length,buildingInfo.wide)*15000.00;
				}
				else{
					return areaCalculation(buildingInfo.length,buildingInfo.wide)*25000.00;
				}
		   }
		else{
			return 0.0;
		}
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

}
