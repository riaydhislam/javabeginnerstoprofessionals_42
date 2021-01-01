package com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm;

public class BuildingInfoCalculation extends BuildingInfo {

	long id;
	String type;
	
	// constructors methods
	public BuildingInfoCalculation() {
		super();
	}

	public BuildingInfoCalculation(long buId, String type, double length, double wide) {
		super(buId, type, length, wide);
	}
	
	//reusing parent constructor
	public BuildingInfoCalculation(BuildingInfo buildingInfo) {
		super(buildingInfo.buId, buildingInfo.type, buildingInfo.length, buildingInfo.wide);
	}

	// methods
	@Override
	public double areaCalculation(double l, double w) {
		return l * super.wide;
	}

	@Override
	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}
		
	@Override
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
	
	@Override
	public double priceCalculation(BuildingInfo buildingInfo) {
		return super.priceCalculationLocal(buildingInfo);
	}
	

}
