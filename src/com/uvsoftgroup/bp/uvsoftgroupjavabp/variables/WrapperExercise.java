package com.uvsoftgroup.bp.uvsoftgroupjavabp.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WrapperExercise {

	public static void autoboxingAndUnboxing() {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;

		// Autoboxing: Converting primitives into objects
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;

		// Printing objects
		System.out.println("---Printing object values---");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		// Unboxing: Converting Objects to Primitives
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;

		// Printing primitives
		System.out.println("---Printing primitive values---");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);

	}

	public List<Integer> intArrayToIntegerList(int[] arr) {
		
		 // java 8++ version 
		List<Integer> list= new ArrayList<Integer>();
		Collections.addAll(list, Arrays.stream(arr).boxed().toArray(Integer[]::new));
		return list;
	}

	public int[] integerListToIntArray(List<Integer> list) {
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = list.get(i);
		return arr;
	}

	public static void main(String args[]) {
		
		// WrapperExercise.autoboxingAndUnboxing();
		
		int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };
		long[] arrl = new long[] { 3L, 7L, 8, 2, 3, 2, 7};

		WrapperExercise wrapperExercise=new WrapperExercise();
		
		List<Integer> list = wrapperExercise.intArrayToIntegerList(arr);
		list.forEach(l -> System.out.println(l));
		
		int[] arr3=wrapperExercise.integerListToIntArray(list);
		
	   for(int i:arr3){
		   System.out.println(i);
	   }
		
		
	}

}
