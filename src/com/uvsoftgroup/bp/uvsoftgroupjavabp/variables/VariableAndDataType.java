package com.uvsoftgroup.bp.uvsoftgroupjavabp.variables;

public class VariableAndDataType {
	int variableInstance = 10; // instance variable
	static int VARIABLE_STATIC = 10; // static variable

	// add numbers method
	public int add(int i, int j) {
		int z = 10; // local variable z
		int addValues = z + i + j; // local variable addValues
	 
		return addValues;
	}

	public static void variableWidening() {
		int a = 10;
		float f = a;
		System.out.println(a);
		System.out.println(f);
	}

	public static void variableNarrowingOrTypecasting() {
		float fValue = 10.5f;
		// int a=fValue;//Compile time error
		int a = (int) fValue;
		System.out.println(fValue);
		System.out.println(a);
	}

	public static void variableOverflow() {
		// Overflow
		int a = 130;
		byte b = (byte) a;
		System.out.println(a);
		System.out.println(b);
	}

	public static void variableAddingLowerType() {
		byte value1 = 20;
		byte value2 = 20;
		// int c=value1+value2; // Compile Time Error: because value1+value2=40 will be int
		 byte c = (byte) (value1 + value2);
		System.out.println(c);

	}

	public static void main(String[] args) {
		VariableAndDataType variableAndType = new VariableAndDataType();
	
		int value = variableAndType.add(2, 2);

		 System.out.println(value);

		// System.out.println(VariableAndDataType.VARIABLE_STATIC);
		// System.out.println(VariableAndDataType.VARIABLE_STATIC);
		// System.out.println(VariableAndDataType.VARIABLE_STATIC);

		// VariableAndDataType.variableWidening();

		// VariableAndDataType.variableNarrowingOrTypecasting();

		// VariableAndDataType.variableOverflow();
		
		// VariableAndDataType.variableAddingLowerType();

	}

}
