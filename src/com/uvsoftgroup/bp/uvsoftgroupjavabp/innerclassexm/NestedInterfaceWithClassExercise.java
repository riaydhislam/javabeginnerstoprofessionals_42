package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

class AreaCalculation {

	public double areaCalculation(double l, double w) {
		return l * w;
	}

	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}

	interface IVolumnCalculation {
		// standard interface
		double volumnCalculation(double l, double w, double h);

		// default interface java 8+
		default double volumnCalculationByDefault(double l, double w, double h) {
			return l * w * h;
		}

		// static interface java 8+
		static double volumnCalculationByStatic(double l, double w, double h) {
			return l * w * h;
		}
	}
}

class NestedInterfaceWithClassExercise extends AreaCalculation implements AreaCalculation.IVolumnCalculation {
	@Override
	public double volumnCalculation(double l, double w, double h) {
		return l * w * h;
	}

	public double areaCalculation(double l, double w) {
		return l * w;
	}

}
