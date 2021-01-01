package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

public class MemberInnerClassExerciseMain {

	public static void main(String args[]) {
		// outer class instance
		MemberInnerClassExercise memberInnerClassExercise = new MemberInnerClassExercise();
		System.out.println("Outer Area:" + memberInnerClassExercise.areaCalculationOuter(5.00, 10.00));
		System.out.println("Outer Volumn:" + memberInnerClassExercise.volumnCalculationOuter(5.00, 10.00, 1.50));

		// inner class instance
		MemberInnerClassExercise.Inner inner = memberInnerClassExercise.new Inner();
		System.out.println("Inner Area Price:" + inner.areaBasedPriceCalculation(5.00, 10.00));
		System.out.println("Inner Volumn Price:" + inner.volumnBasedPriceCalculation(5.00, 10.00, 1.50));
	}

}
