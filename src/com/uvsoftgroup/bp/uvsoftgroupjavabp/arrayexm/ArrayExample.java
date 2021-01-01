package com.uvsoftgroup.bp.uvsoftgroupjavabp.arrayexm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayExample {

	public static void declarationAndInstantiation() {
		// int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };
		// primitive data type array
		// declaration and instantiation
		int a[] = new int[8];
		// initialization of value
		a[0] = 3;
		a[1] = 7;
		a[2] = 8;
		a[3] = 2;
		a[4] = 3;
		a[5] = 2;
		a[6] = 7;
		a[7] = 7;
		// non-primitive/Wrapper class/Object data type array
		Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
		// older java
		List<Integer> list1 = Arrays.asList(arr);
		// java 8+
		List<Integer> list2=Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());
		
		String[] stringArr = {"", "B", "A","", "C", "" };
		
		List<String> stringList=Arrays.stream(stringArr)
				.collect(Collectors.toList());
		
		List<String> filtered =stringList.stream()
				.filter(str -> !str.isEmpty())
				.collect(Collectors.toList());

		//System.out.println("filtered:" +filtered);
		
		int count =(int) stringList.stream().filter(str -> str.isEmpty()).count();
		
		//System.out.println("count:" +count);
		
		// traversing array
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		}
		
		Arrays.sort(arr, Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Comparator.nullsLast(Comparator.reverseOrder()));
		System.out.println(Arrays.toString(arr));

		Arrays.sort(stringArr, Comparator.nullsLast(Comparator.naturalOrder()));
		//System.out.println(Arrays.toString(stringArr));
		Arrays.sort(stringArr, Comparator.nullsLast(Comparator.reverseOrder()));
		//System.out.println(Arrays.toString(stringArr));
		
		
		
		Map<Integer, Long> elementCountMap =list2.stream()
	            .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		
		System.out.println(elementCountMap);
		
	    List<Integer> listWithoutDuplicates1 =list2.stream()
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
                .collect(Collectors.toList());
		
		System.out.println(listWithoutDuplicates1);
		
		Set<Integer> set=Arrays.stream(a).boxed().collect(Collectors.toSet());
		set.forEach(l->System.out.println(l));
		  
		 Set<Integer> hashSet = new TreeSet<>(list2);
	     List<Integer> listWithoutDuplicates2 = new ArrayList<>(hashSet);
	     listWithoutDuplicates2.forEach(l->System.out.println(l));
	     
	}

	// to copy all elements of one array into another array
	public static int[] copyArrayToArray(int[] arr) {
		// Create another array arr2 with size of arr
		int r[] = new int[arr.length];
		// Copying all elements of one array into another
		for (int i = 0; i < arr.length; i++) {
			r[i] = arr[i];
		}
		return r;
	}

	public static void multidimensionalArray() {
		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		// 2D array printing
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void addMatrices(int a[][], int b[][]) {
		// creating two matrices

		// creating another matrix to store the sum of 2 matrices
		int rows = a.length;
		int cols = a[0].length;
		int c[][] = new int[rows][cols];

		// adding and printing addition of 2 matrices
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

	public static void multiplicationMatrices(int a[][], int b[][]) {

		// creating another matrix to store the sum of 2 matrices
		int rows = a.length;
		int cols = a[0].length;
		int c[][] = new int[rows][cols];

		// adding and printing addition of 2 matrices
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}
	}

	public static void subtractTwoMatrices(int a[][], int b[][]) {
		// Calculates number of rows and columns present in given matrix
		int rows = a.length;
		int cols = a[0].length;
		// Array diff will hold the result
		int diff[][] = new int[rows][cols];

		// Performs subtraction of matrices a and b. Store the result in matrix
		// diff
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				diff[i][j] = a[i][j] - b[i][j];
			}
		}

		System.out.println("Subtraction of two matrices: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(diff[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void identityMatrixCheck(int a[][]) {
		int rows, cols;
		boolean flag = true;
		// Calculates the number of rows and columns present in the given matrix

		rows = a.length;
		cols = a[0].length;

		// Checks whether given matrix is a square matrix or not
		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			// Checks if diagonal elements are equal to 1 and rest of elements
			// are 0
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("Given matrix is an identity matrix");
			else
				System.out.println("Given matrix is not an identity matrix");
		}
	}

	public static void frequencyOfElement(int[] arr) {
		// Array fr will store frequencies of element
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		// Displays the frequency of each element present in array
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println(" " + arr[i] + "|" + fr[i]);
		}
	}

	public static void duplicateOfElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]);
				}
			}
		}
	}

	public static int[] reverseArray(int[] arr) {
		// Loop through the array in reverse order
		int c[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			c[i] = arr[(arr.length - 1) - i];
		}
		return c;
	}

	public static void eventOrOddPosition() {

		// Initialize array
		int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };

		/*
		 * Loop through the array by incrementing value of i by 2 Here, i will
		 * start from 1 as first even positioned element is present at position
		 * 
		 */
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

		/*
		 * Loop through the array by incrementing value of i by 2 Here, i will
		 * start from 0 as first even positioned element is present at position
		 * 
		 */
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
	}

	public static void largestOrSmallestElementOfArray(int[] arr) {

		// Initialize max with first element of array.
		int max = arr[0];
		int min = arr[0];
		// Loop through the array
		for (int i: arr) {
			// Compare elements of array with max
			if (i > max) {
				max = i;
			}
		}
		// Loop through the array
		for (int i: arr) {
			// Compare elements of array with max
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Largest element: " + max);
		System.out.println("Smallest element: " + min);
	}

	public static void sumElementOfArray(int[] arr) {

		// Initialize max with first element of array.
		int sum = 0;
		// Loop through the array
		for (int i:arr) {
			sum = sum + i;
		}
		System.out.println("Sum element: " + sum);
	}

	public static void sortAscOrDescOfArray(int[] arr) {
		int temp = 0;
		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Displaying elements of array after sorting
		// System.out.println(Arrays.toString(arr));

		// Sort the array in descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Displaying elements of array after sorting
		// System.out.println(Arrays.toString(arr));

		// java 8+ ascending order
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Arrays.sort(array,  Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println("ASC:" +Arrays.toString(array));
		
		Arrays.sort(array, Comparator.nullsLast(Collections.reverseOrder()));
		System.out.println("DESC:" +Arrays.toString(array));
		
		
		
	}

	// sort in descending order
	public static double[] sortDescendingOrderArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					double x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}
		}
		return arr;
	}

	// sort in ascending order
	public static double[] sortAscendingOrderArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					double x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}
		}
		return arr;
	}

	public static int getLargestFromAnyPosition(int[] arr, int total, int position) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		if (position == 0) {
			return arr[position];
		} else {
			return arr[total - position];
		}
	}

	public static int removeDuplicateUsingTemporary(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static int removeDuplicateUsingSeparateIndex(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}

	public static int removeDuplicateUsingUnsortedArray(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void oddOrEventSumMaxMinNumber(int[] a) {
		int sumOdd = 0;
		int sumEvn = 0;
		int sum = 0;
		int max = a[0];
		int min = a[0];
		// Loop through the array
		for (int i : a) {
			// Compare elements of array with max
			if (i > max) {
				max = i;
			}
		}
		// Loop through the array
		for (int i : a) {
			// Compare elements of array with min
			if (i < min) {
				min = i;
			}
		}

		// Loop through the array
		for (int i : a) {
			sum = sum + i;
		}

		for (int i : a) {
			if (i % 2 != 0) {
				sumOdd = sumOdd + i;
			}
		}
	
		for (int i : a) {
			if (i % 2 == 0) {
				sumEvn = sumEvn + i;
			}
		}

		System.out.println("Largest element: " + max);
		System.out.println("Smallest element: " + min);
		System.out.println("Sum:" + sum);
		System.out.println("sumEvn:" +sumEvn);
		System.out.println("sumOdd:"+sumOdd);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };
		List<Integer> arr2=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		double[] arrD = new double[] { 3.2, 7, 8, 2, 3, 2, 7, 7 };

		int a1[][] = { { 3, 5, 7 }, { 3, 4, 5 } };
		int b1[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		
		int freq=Collections.frequency(arr2, 7);
        System.out.println(freq);
		 // declarationAndInstantiation();

		// System.out.println(Arrays.toString(copyArrayToArray(arr)));

		// ArrayExample.addMatrices(a1, b1);

		// ArrayExample.multiplicationMatrices(a1, b1);
		// ArrayExample.subtractTwoMatrices(a1, b1);

		// ArrayExample.frequencyOfElement(arr);
		// ArrayExample.duplicateOfElement(arr);

		// System.out.println(Arrays.toString(reverseArray(arr)));
		// ArrayExample.eventOrOddPosition();

		 // largestOrSmallestElementOfArray(arr);
		// sumElementOfArray(arr);
		 sortAscOrDescOfArray(arr);
		// oddOrEventSumMaxMinNumber(arr);

		// System.out.print(Arrays.toString(sortAscendingOrderArray(arrD)));
		// System.out.print(Arrays.toString(sortDescendingOrderArray(arrD)));

		// System.out.println(getLargestFromAnyPosition(arr,7,0));
		/*
		 * Arrays.sort(arr); int value=removeDuplicateUsingTemporary(arr,
		 * arr.length); for (int i=0; i<value; i++) { System.out.print(arr[i]+
		 * " "); }
		 */

		;

	}

}
