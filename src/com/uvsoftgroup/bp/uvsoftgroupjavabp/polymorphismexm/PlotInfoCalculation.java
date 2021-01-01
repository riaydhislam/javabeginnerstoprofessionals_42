package com.uvsoftgroup.bp.uvsoftgroupjavabp.polymorphismexm;

public class PlotInfoCalculation extends PlotInfoUtil {
	
    /**
     * 
     * @param l
     * @param w
     * @return
     */
	public int calculateArea(int l, int w) {
		return l * w;
	}
	
	/**
	 * 
	 * @param l
	 * @param w
	 * @return
	 */
	public long calculateArea(long l, long w) {
		if(l>=0 && w>=0){
			return l * w;
		}
		else{
			return 0;
		}
		
	}
	/**
	 * 
	 * @param l
	 * @param w
	 * @return
	 */
	public float calculateArea(float l, float w) {
		if(l>=0 && w>=0){
			return l * w;
		}
		else{
			return 0;
		}
	}
	
	/**
	 * 
	 * @param l
	 * @param w
	 * @return
	 */
	public double calculateArea(double l, double w) {
		if(l>=0 && w>=0){
			return l * w;
		}
		else{
			return 0;
		}
	}
	/**
	 * 
	 * @param l
	 * @param w
	 * @param h
	 * @return
	 */
	public double calculateVolumn(double l, double w, double h) {
		if(l>=0 && w>=0 && h>=0){
			return l * w * h;
		}
		else{
			return this.calculateArea(l, w);
		}
	}
	
	 public double getPlotPriceByPlType(String type, double l , double w){
	    	if(!type.isEmpty()){
	    		if(type.equals("R")&& (l!=0.0 && w!=0.0)){
	    			return super.getPlotPriceByPlType(type, l, w)+10;
	    		}
	    		
	    		else if(type.equals("I")&& (l!=0.0 && w!=0.0)){
	    			return super.getPlotPriceByPlType(type, l, w)+20;
	    		}
	    		else if(type.equals("C")&& (l!=0.0 && w!=0.0)){
	    			return super.getPlotPriceByPlType(type, l, w)+30;
	    		}
	    		
	    		else if(type.equals("M")&& (l!=0.0 && w!=0.0)){
	    			return super.getPlotPriceByPlType(type, l, w)+50;
	    		}
	    		else{
	    			return 0.0;
	    		}
	    	}
			return 0.0;
	    	
	    }
	
}
