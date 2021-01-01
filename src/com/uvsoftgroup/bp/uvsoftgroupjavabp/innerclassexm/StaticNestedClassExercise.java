package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

// outer class
public class StaticNestedClassExercise {

	private static double height = 1.25; // static variable

	public static double areaCalculationOuter(double l, double w) {
		return l * w;
	}

	public static double volumnCalculationOuter(double l, double w, double h) {
		return areaCalculationOuter(l, w) * h;
	}

	// nested static inner class
	static class Inner {
		
		public double areaCalculation(double l, double w) {
			return areaCalculationOuter(l, w);
		}

		public double volumnCalculation(double l, double w, double h) {
			return volumnCalculationOuter(l, w, height);
		}
	}
	
}
