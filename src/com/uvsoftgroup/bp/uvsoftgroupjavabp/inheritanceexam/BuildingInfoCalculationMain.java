package com.uvsoftgroup.bp.uvsoftgroupjavabp.inheritanceexam;


public class BuildingInfoCalculationMain {

	public static void main(String[] args) {
		
		BuildingCalculation ob = new BuildingCalculation();
		
		GeoLocation geoLocation1=new GeoLocation();
		geoLocation1.setLatCord(22.111);
		geoLocation1.setLonCord(91.111);
		
		GeoLocation geoLocation2=new GeoLocation();
		geoLocation2.setLatCord(23.99);
		geoLocation2.setLonCord(92.111);
		
		BuildingCalculation ob1 = new BuildingCalculation();
		ob1.setId(10);
		ob1.setType("I");
		ob1.setPrice(10.00);
		System.out.println("BuildingCalculation:" +ob1);
		
		BuildingCalculation ob3 = new BuildingCalculation(10,"R",10.00,10.00);
		System.out.println(ob3.getBuId());
		
		BuildingCalculation ob5 = new BuildingCalculation(10,"R",10.00,20.00,30.00);
		System.out.println(ob5.getPrice());
		
		BuildingCalculation ob6 = new BuildingCalculation(10,geoLocation1);
		System.out.println(ob6.getGeoLocation().getLatCord());
		
		BuildingCalculation ob7 = new BuildingCalculation(10,geoLocation2);
		System.out.println(ob7.getGeoLocation().getLonCord());
	
		
		BuildingCalculation ob4 = new BuildingCalculation();
		System.out.println("Area:" +ob4.areaCalculation(10.00, 10.00));
		System.out.println("Area by type:" +ob4.areaCalculation("B", 20.00, 20.00));
		
		System.out.println("Area Calculation from Building Type:" 
		+ob1.areaCalculationFromBuildingType(20.00, 20.00));
		
		System.out.println("Volumn from BuidlingInfo:" +ob4.volumnCalculation(10.00,10.00,10.00));
		
		System.out.println("Volumn from BuidlingCalculation:" 
		+ob1.volumnCalculation("I",10.00,10.00,10.00));
		
		System.out.println("Price by Type:" +ob4.priceCalculation("R",10.00, 10.00));
		
		
		GeoLocation geoLocation=new GeoLocation();
		double distance= geoLocation.calculateDistanceBetweenPoints(
				ob6.getGeoLocation().getLonCord(),
				ob6.getGeoLocation().getLatCord(), 
				ob7.getGeoLocation().getLonCord(),
				ob7.getGeoLocation().getLatCord());
		System.out.println("Distance:" +distance);
	}
}
