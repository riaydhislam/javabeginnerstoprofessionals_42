package com.uvsoftgroup.bp.uvsoftgroupjavabp.polymorphismexm;

public class PlotInfoUtil {
    private long plId;
    private String plType;
    private double plPrice;
    
    public double getPlotPriceByPlType(String type, double l , double w){
    	if(!type.isEmpty()){
    		if(type.equals("R")&& (l!=0.0 && w!=0.0)){
    			return l*w*1000.00;
    		}
    		
    		else if(type.equals("I")&& (l!=0.0 && w!=0.0)){
    			return l*w*2000.00;
    		}
    		else if(type.equals("C")&& (l!=0.0 && w!=0.0)){
    			return l*w*3000.00;
    		}
    		
    		else if(type.equals("M")&& (l!=0.0 && w!=0.0)){
    			return l*w*4000.00;
    		}
    		else{
    			return 0.0;
    		}
    	}
		return 0.0;
    	
    }
    
    
}
