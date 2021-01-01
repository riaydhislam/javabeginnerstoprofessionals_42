package com.uvsoftgroup.bp.uvsoftgroupjavabp.castingexm;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.abstractionexm.IBuildingInfo;

public class CastingExercise extends BuildingUtilityInfo {
    /**
     * 
     * @param bu
     * @param l
     * @param w
     * @param h
     * @return double
     */
	public double volumnCalculation(BuildingUtilityInfo bu, double l, double w, double h) {// upcasting CastingExercise
		if (bu instanceof CastingExercise) {
			CastingExercise c = (CastingExercise) bu;// Downcasting
			if (l >= 0.0 && w >= 0.0) {
				return c.volumnCalculation(l, w, h);
			} else {
				return 0.0;
			}
		} else {
			return 0.0;
		}
	}
/**
 * 
 * @param b
 * @param l
 * @param w
 * @return
 */
	public double areaCalculation(IBuildingInfo bi, double l, double w) {// upcasting
																		// IBuildingInfo
		if (bi instanceof BuildingUtilityInfo) {
			BuildingUtilityInfo bOb = (BuildingUtilityInfo) bi;// Downcasting
			if (l >= 0 && w >= 0) {
				return bOb.areaCalculation(l, w)+10.00;
			} else {
				return 0.0;
			}

		} else if (bi instanceof BuildingCalculationInfo) {
			BuildingCalculationInfo cOb = (BuildingCalculationInfo) bi;// Downcasting
			if (l >= 0 && w >= 0) {
				return cOb.areaCalculation(l, w)+20;
			} else {
				return 0.0;
			}
		} else {
			return 0.0;
		}
	}

}
