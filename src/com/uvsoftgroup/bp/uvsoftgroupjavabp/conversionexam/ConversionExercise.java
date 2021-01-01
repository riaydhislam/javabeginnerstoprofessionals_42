package com.uvsoftgroup.bp.uvsoftgroupjavabp.conversionexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.PlotInfo;
import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;
import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRole;

public class ConversionExercise {

	public List<Integer> arrayToList(int[] arr) {
		// int[] to Integer[]:
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new); 	
		System.out.println("int[] array from Integer[]:" +Arrays.toString(array));	
		
		// naturalOrder sort
		Arrays.sort(array,  Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println("naturalOrder():" +Arrays.toString(array));
		// reverseOrder sort
		Arrays.sort(array, Comparator.nullsLast(Collections.reverseOrder()));
		System.out.println("reverseOrder():" +Arrays.toString(array));
		
		// Integer[] to int[]:
		 int[] intArray = Arrays.stream(array).filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
		 System.out.println("Integer[] array from int[]:"+Arrays.toString(intArray));
		 
		// autoboxing and unboxing
		// int [] array to List<Integer> list
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		// List<Integer> list = Arrays.stream(array).collect(Collectors.toList());
		return list;
	}

	public Set<Integer> arrayToSet(int[] arr) {
		// int[] to Integer[]:
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new); 	
		System.out.println("int[] array from Integer[]:" +Arrays.toString(array));	
		// autoboxing and unboxing
		// int [] array to List<Integer> list
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		Set<Integer> set1 = Arrays.stream(array).collect(Collectors.toSet());
		return set1;
	}
	
	public int[] listToArray(List<Integer> list) {
		// Filter out the null values before mapping
		 int[] arr = list.parallelStream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
		// Map the null values to a default value
		// int[] arr = list.parallelStream().map(i -> i == null ? -1 : i).mapToInt(Integer::intValue).toArray();
		//Handle null inside the lambda expression
		// int[] arr = list.parallelStream().mapToInt(i -> i == null ? -1 : i.intValue()).toArray();
		// if no null value into list
		// int[] arr = list.parallelStream().mapToInt(Integer::intValue).toArray(); 
		 
		return arr;
	}
	
	public Set<UserRegistration> listToSet(List<UserRegistration> list) {
		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		Set<UserRegistration> treeSet = list.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())));
		return treeSet;
	}
	
	
	public List<UserRegistration> setToList(Set<UserRegistration> set) {
		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		List<UserRegistration> list =set.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
				.stream()
				.collect(Collectors.toList());	
		
		// List<UserRegistration> aList = set.stream().collect(Collectors.toList()); 
		
		return list;
	}
	
	
	public Map<Long, UserRegistration> listToMap(List<UserRegistration> list) {
		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		 Map<Long, UserRegistration> map = list.stream()
			      .collect(Collectors.toMap(UserRegistration::getUserRegistrationId, ur -> ur));
		 // with duplicate key 
		 Map<Long, UserRegistration> map2 = list.stream()
				 .collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
				 .stream()
				 .collect(Collectors.toMap(UserRegistration::getUserRegistrationId,
			      Function.identity(),(e1, e2) -> e1, LinkedHashMap::new));
		 
			// Converting Product List into a Map with remove duplicate
			Map<Long, UserRegistration> map3 = list.stream()
					.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
					.stream()
					.collect(Collectors.toMap(ur ->ur.getUserRegistrationId(), ur -> ur));
		
		 
		 return map2;
		
	}
	
	
	public List<UserRole> mapToList(Map<Integer, UserRole> map) {
		
		Comparator<UserRole> cmId = Comparator.comparing(UserRole::getUserRoleId);
		List<UserRole> list =  map.entrySet()
				.stream()
				.map(e -> {
					UserRole r=new UserRole();	
					r.setUserRoleId(e.getValue().getUserRoleId());
					r.setUserRoleName(e.getValue().getUserRoleName());
					r.setUserRoleType(e.getValue().getUserRoleType());
					return r;
				})
				.sorted(cmId.reversed())
				.collect(Collectors.toList());
		
		 return list;
		
	}
	
	
	
	private static List<UserRegistration> setUserRegistrationData() {
		List<UserRegistration> list = new ArrayList<UserRegistration>();

		UserRegistration ur3 = new UserRegistration();
		ur3.setUserRegistrationId(12L);
		ur3.setUserAddressId(103L);
		ur3.setUserRegistrationName("Test003");
		ur3.setUserRegistrationfullName("cc");

		UserRegistration ur1 = new UserRegistration();
		ur1.setUserRegistrationId(10L);
		ur1.setUserAddressId(101L);
		ur1.setUserRegistrationName("Test001");

		UserRegistration ur2 = new UserRegistration();
		ur2.setUserRegistrationId(11L);
		ur2.setUserAddressId(102L);
		ur2.setUserRegistrationName("Test002");

		UserRegistration ur4 = new UserRegistration();
		ur4.setUserRegistrationId(13L);
		ur4.setUserAddressId(103L);
		ur4.setUserRegistrationName("Test003");
		ur4.setUserRegistrationfullName("ab");

		UserRegistration ur5 = new UserRegistration();

		list.add(ur3);
		list.add(ur1);
		list.add(ur2);
		list.add(ur4);

		return list;
	}
	
	
	public static Map<Integer, UserRole> getUnSortedUserDefinedObjectHashMap() {

		Map<Integer, UserRole> map = new HashMap<>();

		UserRole ur1 = new UserRole();
		ur1.setUserRoleId(105L);
		ur1.setUserRoleName("Admin");
		ur1.setUserRoleType("AD");

		UserRole ur11 = new UserRole();
		ur11.setUserRoleId(105L);
		ur11.setUserRoleName("Admin");
		ur11.setUserRoleType("AD");

		UserRole ur2 = new UserRole();
		ur2.setUserRoleId(102L);
		ur2.setUserRoleName("Executive");
		ur2.setUserRoleType("EX");

		UserRole ur3 = new UserRole();
		ur3.setUserRoleId(103L);
		ur3.setUserRoleName("Suervisor");
		ur3.setUserRoleType("SU");

		UserRole ur4 = new UserRole();
		ur4.setUserRoleId(104L);
		ur4.setUserRoleName("Officer");
		ur4.setUserRoleType("OF");

		System.out.println("equals:" + ur1.equals(ur11)); // true

		map.put(7, ur3);
		map.put(1, ur1);
		map.put(10, ur11);
		map.put(4, ur4);
		map.put(2, ur2);

		return map;

	}
	
	
	public static void main(String args[]) {
		int[] arr = new int[] { 3, 7, 8, 2, 3, 2, 7, 7 };
		ConversionExercise conversionExercise = new ConversionExercise();
		
		List<Integer> list = conversionExercise.arrayToList(arr);
		// list.forEach(l -> System.out.println(l));
		Set<Integer> set1 = conversionExercise.arrayToSet(arr);
		//set1.forEach(l -> System.out.println("int[] to Set<Integer>:" +l));
		 
		// added null value into the existing list
		// list.add(null);
		 int maxValue=Collections.max(list);
		// System.out.println("maxValue:"+maxValue);
		 int minValue=Collections.min(list);
		//System.out.println("minValue:"+minValue);
		 
		int[] arrResult = conversionExercise.listToArray(list);
		//System.out.println(Arrays.toString(arrResult));
		
		List<UserRegistration> uRList= setUserRegistrationData();
		Set<UserRegistration> set= conversionExercise.listToSet(uRList);
		//set.forEach(l -> System.out.println("TreeSet:" +l));
		
		List<UserRegistration> urListBack= conversionExercise.setToList(set);
		//urListBack.forEach(l -> System.out.println("urListBack:" +urListBack));
		
		Map<Long, UserRegistration> urMap= conversionExercise.listToMap(uRList);
		System.out.println("urMap:" + urMap);
		
		
		Map<Integer, UserRole> map= getUnSortedUserDefinedObjectHashMap();
		
		
		List<UserRole> listFromMap= conversionExercise.mapToList(map);
		listFromMap.forEach(l -> System.out.println(l));
		
	}

}
