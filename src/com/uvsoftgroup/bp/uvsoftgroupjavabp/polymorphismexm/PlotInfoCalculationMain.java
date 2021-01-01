package com.uvsoftgroup.bp.uvsoftgroupjavabp.polymorphismexm;

public class PlotInfoCalculationMain {
	public static void main(String[] args) {
		
		PlotInfoCalculation plotInfoCalculation=new PlotInfoCalculation();
		
		int areaSqMi= plotInfoCalculation.calculateArea(20, 100);
		long areaSqMl= plotInfoCalculation.calculateArea(20L, 100L);
		float areaSqMf= plotInfoCalculation.calculateArea(20, 100.0f);
		
		double areaSqMd= plotInfoCalculation.calculateArea(20.00, 100.00);
		
		double areaSqMV= plotInfoCalculation.calculateVolumn(20.00, 100.00,-1.15);
		
		System.out.println("Area:"+ areaSqMi);
		System.out.println("Area:"+ areaSqMl);
		System.out.println("Area:"+ areaSqMf);
		System.out.println("Area:"+ areaSqMd);
		
		System.out.println("Volumn:"+ areaSqMV);
		
		double priceChild= plotInfoCalculation.getPlotPriceByPlType("R", 10.00, 15.00);
		System.out.println("Price Child:"+ priceChild);
		
		PlotInfoUtil plotInfoUtil=new PlotInfoUtil();
		
		double priceParent= plotInfoUtil.getPlotPriceByPlType("R", 10.00, 15.00);
		System.out.println("Price Parent:"+ priceParent);
		
		
		
		
	}
}
