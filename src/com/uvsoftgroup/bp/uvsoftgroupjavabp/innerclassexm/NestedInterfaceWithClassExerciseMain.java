package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm.AreaCalculation.IVolumnCalculation;

public class NestedInterfaceWithClassExerciseMain {
	public static void main(String args[]) {
		AreaCalculation areaCalculation = new NestedInterfaceWithClassExercise();
		
		double value=areaCalculation.areaCalculation(5.0, 10.00);
		System.out.println("areaCalculationOuter:" +value);

		NestedInterfaceWithClassExercise areaCalculation2 = new NestedInterfaceWithClassExercise();
		System.out.println("areaCalculationExtended:" +areaCalculation2.areaCalculation(5.0, 10.00));

		// upcasting here
		AreaCalculation.IVolumnCalculation volumnCalculation = new NestedInterfaceWithClassExercise();
		System.out.println("volumnCalculation:" +volumnCalculation.volumnCalculation(5.0, 10.00, 1.50));
		
		System.out.println("volumnCalculationByDefault:" +volumnCalculation.volumnCalculationByDefault(5.0, 10.00, 1.50));
		
		System.out.println("volumnCalculationByStatic:"+IVolumnCalculation.volumnCalculationByStatic(5.0, 10.00, 1.50));
	}
}
