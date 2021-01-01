package com.uvsoftgroup.bp.uvsoftgroupjavabp.operators;

public class OperatorExercise {

	public static void unaryOperator() {
		int x = 10;
		int a = 10;
		int b = 5;
		int b1 = -5;
		boolean c = true;
		boolean d = false;
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 

		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		System.out.println(~a);// -11 (minus of total positive value which
								// starts from 0)
		System.out.println(~b1);// 9 (positive of total minus, positive starts
								// from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

	}

	public static void arithmeticOperator() {
		int a = 10;
		int b = 5;
		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// 0

		System.out.println(Math.random()+a* a / b + 3 - 1 * 4 / 2);// 21

	}

	public static void shiftOperator() {
		// left
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(20 << 4);// 20*2^4=20*16=320
		// right
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2
		// >> vs >>>
		// For positive number, >> and >>> works same
		System.out.println(20 >> 2);
		System.out.println(20 >>> 2);
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20 >> 2);
		System.out.println(-20 >>> 2);

	}

	public static void logicalAndBitwise() {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a < c);// false && true = false
		System.out.println(a < b & a < c);// false & true = false
		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked
		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked
	}

	public static void ternaryOperator() {
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
	}

	public static void assignmentOperator() {
		int a = 10;
		a += 3;// a=a+3= 10+3
		System.out.println(a);
		a -= 4;// a=a-4= 13-4 =9
		System.out.println(a);
		a *= 2;// 9*2=18
		System.out.println(a);
		a /= 2;// 18/2 =9
		System.out.println(a);

		short b = 10;
		short c = 10;
		a = (short) (b + c);// 20 which is int now converted to short/ type cast
		System.out.println(a);

	}

	public static void main(String args[]) {
		 unaryOperator();
		// OperatorExercise.arithmeticOperator();
		// OperatorExercise.shiftOperator();
		// OperatorExercise.logicalAndBitwise();
		//  OperatorExercise.ternaryOperator();
		// OperatorExercise.assignmentOperator();
	}

}
