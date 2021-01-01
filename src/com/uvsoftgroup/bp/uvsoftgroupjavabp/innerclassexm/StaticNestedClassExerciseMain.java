package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm.StaticNestedClassExercise.Inner;

public class StaticNestedClassExerciseMain {

	public static void main(String args[]) {
		// outer class instance
		StaticNestedClassExercise memberInnerClassExercise = new StaticNestedClassExercise();
		System.out.println("OuterArea:" + StaticNestedClassExercise.areaCalculationOuter(5.00, 10.00));
		System.out.println("Outer Volumn:" + StaticNestedClassExercise.volumnCalculationOuter(5.00, 10.00, 1.50));

		// inner class instance
		StaticNestedClassExercise.Inner inner = new Inner();
		System.out.println("Inner Area:" + inner.areaCalculation(5.00, 10.00));
		System.out.println("Inner Volumn:" + inner.volumnCalculation(5.00, 10.00, 1.50));
	}
}
