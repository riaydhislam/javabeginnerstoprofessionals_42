package com.uvsoftgroup.bp.uvsoftgroupjavabp.innerclassexm;

abstract class Area {
	abstract double areaCalculation(double l, double w);
}

interface IArea {
	double areaCalculation(double l, double w);

	double volumnCalculation(double l, double w, double h);
}


