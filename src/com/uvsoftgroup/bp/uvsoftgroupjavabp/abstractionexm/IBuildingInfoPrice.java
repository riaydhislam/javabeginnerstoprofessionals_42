package com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm;

public interface IBuildingInfoPrice  {
	double priceCalculation(String type, double l, double w);
	double priceCalculation(BuildingInfo buildingInfo);
}
