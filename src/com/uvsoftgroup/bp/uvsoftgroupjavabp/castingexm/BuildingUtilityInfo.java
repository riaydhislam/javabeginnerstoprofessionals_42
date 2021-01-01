package com.uvsoftgroup.bp.uvsoftgroupjavabp.castingexm;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm.BuildingInfo;
import com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm.IBuildingInfo;

public class BuildingUtilityInfo implements IBuildingInfo  {

	@Override
	public double areaCalculation(double l, double w) {
		return l * w;
	}

	@Override
	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}

	@Override
	public double priceCalculation(String type, double l, double w) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double priceCalculation(BuildingInfo buildingInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
