package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SetExercise {

	// String and wrapper classes are comparable by default
	public static void hashSetExm() {
		Set<String> set = new HashSet<String>();
		// Set<String> set = new
		// TreeSet<>(Comparator.comparing(String::length));
		set.add("A");
		set.add("B");
		set.add("D");
		set.add("d");
		set.add("C");
		set.add("C");
		// set.add("");
		// set.add(null); // allows null value

		//set.forEach(s -> System.out.println(s));

		Set<String> treeSet = set.stream().collect(Collectors.toCollection(TreeSet::new));
		 treeSet.forEach(s -> System.out.println(s));
		 	 
		 //set -> list
		List<String> numbersList = new ArrayList<String>(set);       
		//Sort the list
		Collections.sort(numbersList, Collections.reverseOrder());
		//list -> set
		set= new LinkedHashSet<>(numbersList);  
		set.forEach(s -> System.out.println(s));
		
		List<String> list = set.stream().collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));
		
	
	}

	// String and wrapper classes are comparable by default
	public static void linkedHashSetExm() {
		Set<String> set = new LinkedHashSet<String>();
		// Set<String> set = new
		// TreeSet<>(Comparator.comparing(String::length));
		set.add("A");
		set.add("B");
		set.add("D");
		set.add("d");
		set.add("C");
		set.add("C");
		set.add("");
		set.add(null); // allows null value

		set.forEach(s -> System.out.println(s));

		Set<String> treeSet = set.stream().collect(Collectors.toCollection(TreeSet::new));
		treeSet.forEach(s -> System.out.println(s));
		
		List<String> list = set.stream().collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));

	}

	// String and wrapper classes are comparable by default
	public static void treeSetExm() {
		Set<String> set = new TreeSet<String>();
		// Set<String> set = new
		// TreeSet<>(Comparator.comparing(String::length));
		set.add("A");
		set.add("B");
		set.add("D");
		set.add("d");
		set.add("C");
		set.add("C");
		// set.add("");
		// set.add(null); // not allows null value
		set.forEach(s -> System.out.println(s));
		
		List<String> list = set.stream().collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));
	}

	// To add user-defined objects in TreeSet, you need to implement the
	// Comparable interface
	public static void hashSetUserDefined() {

		
		List<UserRegistration> list = setUserRegistrationData();
		HashSet<UserRegistration> set = new HashSet<UserRegistration>(list);
		
		//set.forEach(s -> System.out.println("set:" + s));

		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		
		Comparator<UserRegistration> idSort = (a, b) -> a.getUserRegistrationId().compareTo(b.getUserRegistrationId());
		Comparator<UserRegistration> nameSort = (a, b) -> a.getUserRegistrationName()
				.compareTo(b.getUserRegistrationName());
		Comparator<UserRegistration> userRegistrationfullNameSort = (ur1, ur2) -> ur1.getUserRegistrationfullName()
				.compareTo(ur2.getUserRegistrationfullName());

		Comparator<UserRegistration> cmName = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsLast(String::compareTo));
		Comparator<UserRegistration> cmfullName = Comparator.comparing(UserRegistration::getUserRegistrationfullName,
				Comparator.nullsLast(String::compareTo));

		Comparator<UserRegistration> cmIdAndNameAndFullName = cmId.thenComparing(cmName).thenComparing(cmfullName);

		Comparator<UserRegistration> cm1 = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsLast(String::compareTo));
		Comparator<UserRegistration> cmf = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsFirst(String::compareToIgnoreCase));
		
		// list filter with predicate and sorting
		Predicate<UserRegistration> pred1 = c -> c.getUserRegistrationName().startsWith("Test") && c.getUserRegistrationId() >= 11;


		// hashSet to TreeSet conversion
		Set<UserRegistration> setByNames = new TreeSet<UserRegistration>(new UserRegistrationNameComparator());
		Set<UserRegistration> setByIds = new TreeSet<UserRegistration>(cmId);

		setByNames.addAll(set);
		//setByNames.forEach(s -> System.out.println("setByNames:" +s));
		setByIds.addAll(set);
		//setByIds.forEach(s -> System.out.println("setByIds:"+ s));

		// sorting using Java 1.8 stream
		List<UserRegistration> listOfUrAsc = set.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
				.stream()
				.collect(Collectors.toList());
		listOfUrAsc.forEach(s -> System.out.println("listOfUr ASC:" + s));
		 
		List<UserRegistration> listOfUrDesc = set.stream()
					.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())))
					.stream()
					.collect(Collectors.toList());
		
		 listOfUrDesc.forEach(s -> System.out.println("listOfUr DESC:" + s));
	}

	// To add user-defined objects in TreeSet, you need to implement the
	// Comparable interface
	public static void linkedHashSetUserDefined() {
		
		List<UserRegistration> list = setUserRegistrationData();
		Set<UserRegistration> set = new LinkedHashSet<UserRegistration>(list);
		
		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);

		// set.forEach(s -> System.out.println("linkedHashSet:" + s));
		// hashSet to TreeSet conversion
		Set<UserRegistration> setByNames = new TreeSet<UserRegistration>(new UserRegistrationNameComparator());
		Set<UserRegistration> setByIds = new TreeSet<UserRegistration>(cmId);

		//setByNames.addAll(set);
		// setByNames.forEach(s -> System.out.println("setByNames:" +s));
		 setByIds.addAll(set);
		 setByIds.forEach(s -> System.out.println("setByIds:"+ s));

		
		// sorting using Java 1.8 stream
				List<UserRegistration> listOfUrAsc = set.stream()
						.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
						.stream()
						.collect(Collectors.toList());
				listOfUrAsc.forEach(s -> System.out.println("listOfUr ASC:" + s));
				 
				List<UserRegistration> listOfUrDesc = set.stream()
							.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())))
							.stream()
							.collect(Collectors.toList());
				
				 listOfUrDesc.forEach(s -> System.out.println("listOfUr DESC:" + s));

	}

	// To add user-defined objects in TreeSet, you need to implement the
	// Comparable interface
	public static void treeSetUserDefined() {

		List<UserRegistration> list = setUserRegistrationData();
		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		Set<UserRegistration> set = new LinkedHashSet<UserRegistration>(list);
		
		//set.forEach(s -> System.out.println("TreeSet:" + s));

		
		// sorting using Java 1.8 stream
				List<UserRegistration> listOfUrAsc = set.stream()
						.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
						.stream()
						.collect(Collectors.toList());
				listOfUrAsc.forEach(s -> System.out.println("listOfUr ASC:" + s));
				 
				List<UserRegistration> listOfUrDesc =set.stream()
							.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())))
							.stream()
							.collect(Collectors.toList());
				
				 listOfUrDesc.forEach(s -> System.out.println("listOfUr DESC:" + s));


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
		ur1.setUserRegistrationfullName("bb");

		UserRegistration ur2 = new UserRegistration();
		ur2.setUserRegistrationId(11L);
		ur2.setUserAddressId(102L);
		ur2.setUserRegistrationName("Test002");
		ur2.setUserRegistrationfullName("dd");

		UserRegistration ur4 = new UserRegistration();
		ur4.setUserRegistrationId(12L);
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
	
	
	private static List<UserRegistration> setUserRegistrationDataLinked() {
		List<UserRegistration> list = new LinkedList<UserRegistration>();

		UserRegistration ur3 = new UserRegistration();
		ur3.setUserRegistrationId(12L);
		ur3.setUserAddressId(103L);
		ur3.setUserRegistrationName("Test003");
		ur3.setUserRegistrationfullName("cc");

		UserRegistration ur1 = new UserRegistration();
		ur1.setUserRegistrationId(10L);
		ur1.setUserAddressId(101L);
		ur1.setUserRegistrationName("Test001");
		ur1.setUserRegistrationfullName("bb");

		UserRegistration ur2 = new UserRegistration();
		ur2.setUserRegistrationId(11L);
		ur2.setUserAddressId(102L);
		ur2.setUserRegistrationName("Test002");
		ur2.setUserRegistrationfullName("dd");

		UserRegistration ur4 = new UserRegistration();
		ur4.setUserRegistrationId(12L);
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
	

	public static void main(String args[]) {
		// SetExercise.hashSetExm();
		// linkedHashSetExm();
		 treeSetExm();

		 // hashSetUserDefined();
		//linkedHashSetUserDefined();
		// SetExercise.treeSetUserDefined();
	}

}
