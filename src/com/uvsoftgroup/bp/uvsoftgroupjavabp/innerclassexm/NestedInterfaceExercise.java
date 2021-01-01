package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

interface IAreaCalculation {
	double areaCalculation(double l, double w);

	interface IVolumnCalculation {
		double volumnCalculation(double l, double w, double h);

		default double volumnCalculationByDefault(double l, double w, double h) {
			return l * w * h;
		}

		static double volumnCalculationByStatic(double l, double w, double h) {
			return l * w * h;
		}
	}
}

class NestedInterfaceExercise implements IAreaCalculation.IVolumnCalculation, IAreaCalculation {
	@Override
	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}

	@Override
	public double areaCalculation(double l, double w) {
		return l * w;
	}

}
