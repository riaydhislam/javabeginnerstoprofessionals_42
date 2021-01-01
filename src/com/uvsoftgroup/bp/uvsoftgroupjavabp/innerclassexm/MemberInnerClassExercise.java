package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

public class MemberInnerClassExercise {

	private double height = 1.25;

	public double areaCalculationOuter(double l, double w) {
		return l * w;
	}

	public double volumnCalculationOuter(double l, double w, double h) {
		return areaCalculationOuter(l, w) * h;
	}

	class Inner {
		private double weight = 1.25;
		public double areaBasedPriceCalculation(double l, double w) {
			return areaCalculationOuter(l, w) * 10000.00;
		}

		public double volumnBasedPriceCalculation(double l, double w, double h) {
			return volumnCalculationOuter(l, w, h) * 5000.00;
		}
	}

}
