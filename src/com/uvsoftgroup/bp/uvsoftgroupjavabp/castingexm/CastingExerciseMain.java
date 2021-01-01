package com.uvsoftgroup.bp.uvsoftgroupjavabp.castingexm;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm.IBuildingInfo;

public class CastingExerciseMain {
	
	public static void main(String args[]){  
		IBuildingInfo pBc=new BuildingCalculationInfo();  
		IBuildingInfo pBu=new BuildingUtilityInfo(); 
		CastingExercise c=new CastingExercise();  
		double valuePbc= c.areaCalculation(pBc, 10.00, 10.00);
		double valuePbu= c.areaCalculation(pBu, 10.00, 10.00);
		double valueVolumn =c.volumnCalculation(c, 10.00, 10.00, 2.00);
		System.out.println(valuePbc);
		System.out.println(valuePbu);
		System.out.println(valueVolumn);
		
		} 
}
