package com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm;

public class BuildingInfoCalculationMain {

	public static void main(String args[]) {
		
		BuildingInfoCalculation ob= new BuildingInfoCalculation();
		ob.setBuId(9);
		ob.setType("R");
		ob.setLength(10.00);
		ob.setWide(10.00);
		
		 BuildingInfo bInfo= new BuildingInfoCalculation(9,"R",10.00,10.00);
		// BuildingInfo bInfo= new BuildingInfoCalculation(ob);
		
		double value = bInfo.areaCalculation(bInfo.length, bInfo.wide);
		System.out.println("Area:" + value);

		double volumn = bInfo.volumnCalculation(bInfo.length, bInfo.wide, 1.00);
		System.out.println("Volumn:" + volumn);
		
		double price = bInfo.priceCalculation("W", bInfo.length, bInfo.wide);
		System.out.println("Price:" + price);
		
		double price2 = bInfo.priceCalculation(bInfo);
		System.out.println("Price2:" + price2);
		
		double price3 = bInfo.priceCalculationLocal(ob);
		System.out.println("Price Local:" + price3);
	}
}
