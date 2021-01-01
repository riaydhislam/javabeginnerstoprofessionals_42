package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

public class LocalInnerClassExercise {

	private int data = 30;// instance variable

	public double areaCalculationOuter(double l, double w) {
		return l * w;
	}

	// area method with local inner class
	public double area() {
		double localValue = 10.0;
		// local inner class
		class Local {
			double value = 50.00;

			public double areaCalculation(double l, double w) {
				return areaCalculationOuter(l, w);
			}
		}
		Local local = new Local();
		return local.areaCalculation(5.00, data);
	}

	public static void main(String args[]) {
		LocalInnerClassExercise obj = new LocalInnerClassExercise();
		System.out.println(obj.area());
		System.out.println(obj.areaCalculationOuter(5.00, 30.00));
	}

}
