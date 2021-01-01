package com.uvsoftgroup.bp.uvsoftgroupjavabp.arrayexm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.PlotInfo;

public class ArrayConversion {

	
	public Integer[] intArrayToIntegerArray(int[] arr) {
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		return array;
	}
	
	public int[] integerArrayToInt(Integer[] arr) {
		int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
		return array;
	}
	
	public Long[] longArrayToLongArray(long[] arr) {
		Long[] array = Arrays.stream(arr).boxed().toArray(Long[]::new);
		return array;
	}

	public List<Integer> intArrayToIntegerList(int[] arr) {
		/*
		  // java older version 
		   List<Integer> list=new ArrayList<Integer>(arr.length); 
		    for(int array:arr){
		  list.add(Integer.valueOf(array)); 
		  }
		  return list;
		 */
		
		// java 8+ version
		// List<Integer>
		// list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		// return list;

		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, Arrays.stream(arr).boxed().toArray(Integer[]::new));
		
		Set<Integer> hashSet = new TreeSet<>(list2);
		System.out.println(hashSet);
		List<Integer> list3 = new LinkedList<>(hashSet);
		System.out.println(list3);
		return list2;

		
		// guava or apache commons lang library will be alternative

	}
	
	public int[] integerListToIntArray(List<Integer> list) {
		 
		int [] arr2=list.stream().mapToInt(Integer::intValue).toArray();
		PlotInfo[] plotInfos = list.stream().toArray(PlotInfo[]::new);
		
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = list.get(i);
		return arr;
	}

	

	public static boolean compareList(List<String> ls1, List<String> ls2) {
		// converts List into String and checks string are equal or not
		return ls1.toString().contentEquals(ls2.toString()) ? true : false;
	}

	
	public static void main(String[] args) {
		ArrayConversion arrayConversion = new ArrayConversion();

		int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };
		long[] arrl = new long[] { 3L, 7L, 8, 2, 3, 2, 7};
		
		
		arrayConversion.integerArrayToInt(arrayConversion.intArrayToIntegerArray(arr));

		List<Integer> list = arrayConversion.intArrayToIntegerList(arr);
		list.forEach(l -> System.out.println("unorder:" +l));
		// sorting acs
		Collections.sort(list);
		//list.forEach(l -> System.out.println("ASC:" +l));
		// sorting desc
		Collections.sort(list, Collections.reverseOrder());
		//list.forEach(l -> System.out.println("DESC:"+l));
		
	    int maxValue=Collections.max(list);
		System.out.println("maxValue:"+maxValue);
		int minValue=Collections.min(list);
		System.out.println("maxValue:"+minValue);
			
		int[] array2 = arrayConversion.integerListToIntArray(list);
		// System.out.println(array2.length);

		Integer[] array = arrayConversion.intArrayToIntegerArray(arr);
		// System.out.println(array.length);
		
		Long[] array3 = arrayConversion.longArrayToLongArray(arrl);
		// System.out.println(array3.length);

	}

}
