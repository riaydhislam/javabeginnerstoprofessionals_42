package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

public class NestedInterfaceExerciseMain {
	public static void main(String args[]) {
		IAreaCalculation areaCalculation = new NestedInterfaceExercise();
		System.out.println(areaCalculation.areaCalculation(5.0, 10.00));
		// upcasting here
		IAreaCalculation.IVolumnCalculation volumnCalculation = new NestedInterfaceExercise();
		System.out.println(volumnCalculation.volumnCalculationByDefault(5.0, 10.00, 1.50));
		System.out.println(volumnCalculation.volumnCalculation(5.0, 10.00, 1.50));
		System.out.println(IAreaCalculation.IVolumnCalculation.volumnCalculationByStatic(5.0, 10.00, 1.50));
	}

}
