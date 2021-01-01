package com.uvsoftgroup.bp.uvsoftgroupjavabp.stringclassesexm;

public class StringClassesExercise {

	public static void stringImmutable() {
		String s = "UV";
		// concat() method appends the string at the end
		s.concat("Softgroup");
		//  s=s.concat("Softgroup");  
		// will print Sachin because strings are immutable  objects
		System.out.println(s);
	}
	
	public static void stringBufferAndBuilderMutable() {
		StringBuffer sb=new StringBuffer("UV");  
		sb.append("Softgroup");//now original string is changed  
		System.out.println(sb);//prints UV Java  
		
		StringBuilder sbu=new StringBuilder("UV");  
		sbu.append("Softgroup");//now original string is changed  
		System.out.println(sbu);//prints UV Java  
		
	
	}
	
	 public static void hashCodeStringAndStringBuffer(){  
	        System.out.println("Hashcode test of String:");  
	        String str="UV";  
	        System.out.println(str.hashCode());  
	        str=str+"Softgroup";  
	        System.out.println(str.hashCode());  
	   
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb=new StringBuffer("UV");  
	        System.out.println(sb.hashCode());  
	        sb.append("Softgroup");  
	        System.out.println(sb.hashCode());  
	    }  
	 
	
	public static void stringCompare() {
		  String s1="UV";  
		  String s2="UV";  
		  String s3=new String("UV");  
		  String s4="UVS";
		  // By equals() method
		  System.out.println(s1.equals(s2));//true  
		  System.out.println(s1.equals(s3));//true  
		  System.out.println(s1.equals(s4));//false  
		  // By = = operator
		  System.out.println(s1==s2);//true (because both refer to same instance)  
		  System.out.println(s1==s3);//false(because s3 refers to instance created in non-pool) 
		  
		  // by compareTo()
		  System.out.println(s1.compareTo(s2));//s1 == s2 :0  
		  System.out.println(s4.compareTo(s1));//s1 > s2   :positive value>>1
		  System.out.println(s3.compareTo(s4));//s1 < s2   :negative value>>-1
	
	}
	
	
	public static void main(String args[]) {
		// stringImmutable();
		//stringBufferAndBuilderMutable();
		hashCodeStringAndStringBuffer();
		//stringCompare();
	}

}
