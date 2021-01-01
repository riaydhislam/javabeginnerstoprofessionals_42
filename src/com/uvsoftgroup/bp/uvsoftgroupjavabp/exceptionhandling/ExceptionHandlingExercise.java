package com.uvsoftgroup.bp.uvsoftgroupjavabp.exceptionhandling;

public class ExceptionHandlingExercise {

	public static void arithmeticException() {
		int a = 10;
		int b = 0;
		try {
			// code that may exception raise
			int result = a / b;
		}
		/*
		 * if handling the exception by using Exception class
		 * ArithmeticException try to handle the ArithmeticException using
		 * ArrayIndexOutOfBoundsException
		 */
		catch (ArithmeticException e) {
			// generated default exception message
			System.out.println(e);
			// displaying the custom message
			System.out.println("Can't divided by zero");
			// resolving the exception in catch block
			System.out.println(a / (b + 2));

			// int result2=a/b; //may throw exception

		}
		// rest code of the program
		System.out.println("rest of the code");
	}

	/*
	 * at a time only one exception occurs and its corresponding catch block is
	 * invoked
	 */
	public static void multipleCatchBlock() {
		int i = 10;
		int j = 0;
		try {
			int a[] = new int[5];
			a[4] = i / 10;

			String s = null;
			System.out.println(s.length());

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}

	public static void nestedTryCatchBlock() {
		int i = 10;
		int j = 0;
		try {
			try {
				System.out.println("going to divide");
				int b = i / j;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[5];
				a[5] = i / 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			try {
				String s = null;
				System.out.println(s.length());

			} catch (NullPointerException e) {
				System.out.println("NullPointerException occurs");
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}

	public static void method1() {
		int data = 50 / 0;
	}

	public static void method2() {
		 method1();
		//int a[] = new int[5];
		// a[5] = 10 / 1;
		//method1();
	}

	/*
	 * By default Unchecked Exceptions are forwarded in calling chain
	 * (propagated)
	 */
	public static String exceptionPropagation() {
		String exceptionMessage="";
		try {
			method2();
		} catch (Exception e) {
			exceptionMessage=e.toString();
		}
		return exceptionMessage;
	}

	public static void main(String args[]) {
		 arithmeticException();
		// multipleCatchBlock();
		// nestedTryCatchBlock();
		// System.out.println(exceptionPropagation());
	}
}
