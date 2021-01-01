package com.uvsoftgroup.bp.uvsoftgroupjavabp.clobmeco;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.BuildingInfo;

public class PlotInfoMain {
	public static void main(String[] args) {

		// create and initialization through a instance variable reference
		BuildingInfo buildingInfo = new BuildingInfo();
		buildingInfo.setBuId(1000);
		buildingInfo.setBuLength(10.00);
		buildingInfo.setBuWide(10.00);
		BuildingInfo buildingInfo1 = new BuildingInfo();
		buildingInfo1.setBuId(1001);
		buildingInfo1.setBuLength(100.00);
		buildingInfo1.setBuWide(100.00);

		// create and initialization through a constructor
		PlotInfo ob1 = new PlotInfo(10, 100);
		// create and initialization through a constructor
		PlotInfo ob2 = new PlotInfo(10, 100, 200,"RE001");
		// create and initialization through a method
		PlotInfo ob3 = new PlotInfo();
		ob3.insert(100, 1000, 2001, "RE", "Testing", "R", "Not Registered");
		// create and initialization through a constructor copy
		PlotInfo copyContructor = new PlotInfo(ob3);
		// create and initialization through a constructor by other complex object BuildingInfo
		PlotInfo ob4 = new PlotInfo(buildingInfo1);
		
		System.out.println("constructor:" +ob1);
		System.out.println("constructor:" +ob2);
		System.out.println("copy constructor:" +copyContructor);
		
		double areaFromConstructor = ob4.buildingAreaCalculation();
		System.out.println("areaFromConstructor:" +areaFromConstructor);
		
		double areaFromMethod = ob4.buildingAreaCalculation(buildingInfo1);
		System.out.println("areaFromMethod:" +areaFromMethod);
		
		PlotInfo ob5 = new PlotInfo();
		ob5.setUseType("R");
		
		double priceCalculationByType = ob4.getPriceByUseType(ob5, buildingInfo1);
		
		System.out.println("priceCalculationByType:" +priceCalculationByType);
		

	}
}
