package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

public class AnonymousInnerClassExerciseMain {

	public static void main(String args[]) {
		Area area = new Area() {
			@Override
			public double areaCalculation(double l, double w) {
				return l * w;
			}
		};
		System.out.println(area.areaCalculation(5.0, 10.00));
		
	}
	
}
