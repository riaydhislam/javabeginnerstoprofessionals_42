package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExercise {

	public static void arrayListPrimitive() {
		ArrayList<String> listString = new ArrayList<String>();// Creating
																// arraylist
		listString.add("A");// Adding object in arraylist
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");

		ArrayList<Integer> listInteger = new ArrayList<Integer>();// Creating
																	// arraylist
		listInteger.add(10);// Adding object in arraylist
		listInteger.add(13);
		listInteger.add(16);
		listInteger.add(12);
		listInteger.add(14);

		ArrayList<Long> listLong = new ArrayList<Long>();// Creating arraylist
		listLong.add(10L);// Adding object in arraylist
		listLong.add(13L);
		listLong.add(16L);
		listLong.add(12L);
		listLong.add(14L);

		ArrayList<Double> listDouble = new ArrayList<Double>();// Creating
																// arraylist
		listDouble.add(10.50);// Adding object in arraylist
		listDouble.add(13.12);
		listDouble.add(16.0);
		listDouble.add(12.5);
		listDouble.add(14.5);

		// listInteger.forEach(l->System.out.println(l));

		Collections.sort(listInteger);
		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger, Collections.reverseOrder());
		listInteger.forEach(l -> System.out.println(l));
		
		int valueMax= Collections.max(listInteger);
		int valueMin= Collections.min(listInteger);
		System.out.println(+valueMax+ ":" +valueMin);

		List<Integer> listFilter = listInteger.stream() // converting the list
														// to stream
				.filter(value -> value > 12 && value < 16) // filter the stream
															// to create a new
															// stream
				.collect(Collectors.toList()); // collect the final stream and
												// convert it to a List
		listFilter.forEach(l -> System.out.println(l));

		List<Optional<String>> listOptionalStrings = new ArrayList<>();
		listOptionalStrings.add(Optional.of("one"));
		listOptionalStrings.add(Optional.empty());
		listOptionalStrings.add(Optional.of("two"));
		listOptionalStrings.add(Optional.of("three"));
		listOptionalStrings.add(Optional.empty());
		listOptionalStrings.add(Optional.of("four"));
		listOptionalStrings.add(Optional.ofNullable(null));
		List<String> stringList = listOptionalStrings.stream().filter(Optional::isPresent).map(Optional::get)
				.collect(Collectors.toList());
		stringList.forEach(l -> System.out.println(l));

	}

	public static void linkedListPrimitive() {
		List<String> listString = new LinkedList<String>();// Creating arraylist
		listString.add("A");// Adding object in arraylist
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");

		List<Integer> listInteger = new LinkedList<Integer>();// Creating
																// arraylist
		listInteger.add(10);// Adding object in arraylist
		listInteger.add(13);
		listInteger.add(16);
		listInteger.add(12);
		listInteger.add(14);

		List<Long> listLong = new LinkedList<Long>();// Creating arraylist
		listLong.add(10L);// Adding object in arraylist
		listLong.add(13L);
		listLong.add(16L);
		listLong.add(12L);
		listLong.add(14L);

		List<Double> listDouble = new LinkedList<Double>();// Creating arraylist
		listDouble.add(10.50);// Adding object in arraylist
		listDouble.add(13.12);
		listDouble.add(16.0);
		listDouble.add(12.5);
		listDouble.add(14.5);

		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger);
		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger, Collections.reverseOrder());
		listInteger.forEach(l -> System.out.println(l));
		
		
		
	}

	public static void vectorPrimitive() {
		List<String> listString = new Vector<String>();// Creating arraylist
		listString.add("A");// Adding object in arraylist
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");

		List<Integer> listInteger = new Vector<Integer>();// Creating arraylist
		listInteger.add(10);// Adding object in arraylist
		listInteger.add(13);
		listInteger.add(16);
		listInteger.add(12);
		listInteger.add(14);

		List<Long> listLong = new Vector<Long>();// Creating arraylist
		listLong.add(10L);// Adding object in arraylist
		listLong.add(13L);
		listLong.add(16L);
		listLong.add(12L);
		listLong.add(14L);

		List<Double> listDouble = new Vector<Double>();// Creating arraylist
		listDouble.add(10.50);// Adding object in arraylist
		listDouble.add(13.12);
		listDouble.add(16.0);
		listDouble.add(12.5);
		listDouble.add(14.5);

		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger);
		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger, Collections.reverseOrder());
		listInteger.forEach(l -> System.out.println(l));
	}

	public static void stackPrimitive() {
		Stack<String> listString = new Stack<String>();// Creating arraylist
		listString.add("A");// Adding object in arraylist
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");

		Stack<Integer> listInteger = new Stack<Integer>();// Creating arraylist
		listInteger.add(10);// Adding object in arraylist
		listInteger.add(13);
		listInteger.add(16);
		listInteger.add(12);
		listInteger.add(14);

		Stack<Long> listLong = new Stack<Long>();// Creating arraylist
		listLong.add(10L);// Adding object in arraylist
		listLong.add(13L);
		listLong.add(16L);
		listLong.add(12L);
		listLong.add(14L);

		Stack<Double> listDouble = new Stack<Double>();// Creating arraylist
		listDouble.add(10.50);// Adding object in arraylist
		listDouble.add(13.12);
		listDouble.add(16.0);
		listDouble.add(12.5);
		listDouble.add(14.5);

		listInteger.pop();

		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger);
		listInteger.forEach(l -> System.out.println(l));

		Collections.sort(listInteger, Collections.reverseOrder());
		listInteger.forEach(l -> System.out.println(l));
	}

	public static void priorityQueuePrimitive() {
		Queue<String> listString = new PriorityQueue<String>();// Creating
																// arraylist
		listString.add("A");// Adding object in arraylist
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");

		Queue<Integer> listInteger = new PriorityQueue<Integer>();// Creating
																	// arraylist
		listInteger.add(10);// Adding object in arraylist
		listInteger.add(13);
		listInteger.add(16);
		listInteger.add(12);
		listInteger.add(14);

		Queue<Long> listLong = new PriorityQueue<Long>();// Creating arraylist
		listLong.add(10L);// Adding object in arraylist
		listLong.add(13L);
		listLong.add(16L);
		listLong.add(12L);
		listLong.add(14L);

		Queue<Double> listDouble = new PriorityQueue<Double>();// Creating
																// arraylist
		listDouble.add(10.50);// Adding object in arraylist
		listDouble.add(13.12);
		listDouble.add(16.0);
		listDouble.add(12.5);
		listDouble.add(14.5);

		listInteger.poll();

		listInteger.forEach(l -> System.out.println(l));

		// Collections.sort(listInteger);
		// listInteger.forEach(l->System.out.println(l));

		// Collections.sort(listInteger, Collections.reverseOrder());
		// listInteger.forEach(l->System.out.println(l));
	}

	public static void sortCustomObject() {
		List<UserRegistration> list = setUserRegistrationData();

		// java 8+ lambda expression with Comparator interface
		Comparator<UserRegistration> idSort = (a, b) -> a.getUserRegistrationId().compareTo(b.getUserRegistrationId());
		Comparator<UserRegistration> nameSort = (a, b) -> a.getUserRegistrationName()
				.compareTo(b.getUserRegistrationName());
		Comparator<UserRegistration> userRegistrationfullNameSort = (ur1, ur2) -> ur1.getUserRegistrationfullName()
				.compareTo(ur2.getUserRegistrationfullName());

		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
		Comparator<UserRegistration> cmName = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsLast(String::compareTo));
		Comparator<UserRegistration> cmfullName = Comparator.comparing(UserRegistration::getUserRegistrationfullName,
				Comparator.nullsLast(String::compareTo));

		Comparator<UserRegistration> cmIdAndNameAndFullName = cmId.thenComparing(cmName).thenComparing(cmfullName);

		Comparator<UserRegistration> cm1 = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsLast(String::compareTo));
		Comparator<UserRegistration> cmf = Comparator.comparing(UserRegistration::getUserRegistrationName,
				Comparator.nullsFirst(String::compareToIgnoreCase));
		// java 8+ lambda expression with Comparator interface with group by
		Comparator<UserRegistration> idAndNameSort = Comparator.comparing(UserRegistration::getUserRegistrationId)
				.thenComparing(UserRegistration::getUserRegistrationName);

		// Comparable interface implementation
		Collections.sort(list, idSort);
		// list.forEach(l -> System.out.println(l));

		// Comparator interface implementation
		Collections.sort(list, Collections.reverseOrder(new UserRegistrationNameComparator()));
		// list.forEach(l -> System.out.println(l));

		Collections.sort(list, idSort);
		// list.forEach(l -> System.out.println(l));

		Collections.sort(list, idSort.reversed());
		// list.forEach(l -> System.out.println(l));

		Collections.sort(list, idAndNameSort);
		// list.forEach(l->System.out.println(l));

		Collections.sort(list, Collections.reverseOrder(idSort));
		// list.forEach(l->System.out.println(l));

		// list filter with predicate and sorting
		Predicate<UserRegistration> pred1 = c -> c.getUserRegistrationName().startsWith("Test");
		Predicate<UserRegistration> pred2 = c ->c.getUserRegistrationId() >= 11;
						
		List<UserRegistration> sortedAscList = list.stream()
				.filter(pred1.and(pred2))
				.sorted(cmIdAndNameAndFullName)
				.collect(Collectors.toList());
		sortedAscList.forEach(l->System.out.println(l));
		
		List<UserRegistration> sortedDescList = list.stream()
				//.filter(pred1)
				.sorted(cmIdAndNameAndFullName.reversed())
				.collect(Collectors.toList());
		sortedDescList.forEach(l->System.out.println(l));
		

	}

	public static void removeDuplicateAndSortedFromList() {
		List<UserRegistration> list = setUserRegistrationData();

		Comparator<UserRegistration> idSort = (a, b) -> a.getUserRegistrationId().compareTo(b.getUserRegistrationId());
		Comparator<UserRegistration> nameSort = (a, b) -> a.getUserRegistrationName()
				.compareTo(b.getUserRegistrationName());
		Comparator<UserRegistration> userRegistrationfullNameSort = (ur1, ur2) -> ur1.getUserRegistrationfullName()
				.compareTo(ur2.getUserRegistrationfullName());

		Comparator<UserRegistration> cmId = Comparator.comparing(UserRegistration::getUserRegistrationId);
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

		// Collections.sort(list, Collections.reverseOrder(idSort));
		// list.forEach(l->System.out.println(l));

		// java 8+ lambda expression with Comparator interface with group by
		Comparator<UserRegistration> idAndNameSort = idSort.thenComparing(nameSort).thenComparing(userRegistrationfullNameSort);

		Set<UserRegistration> set = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>(cmId)));
		// set.forEach(l->System.out.println("set:" +l));

		 Set<String> namesAlreadySeen = new HashSet<>();
		 list.removeIf(p ->!namesAlreadySeen.add(p.getUserRegistrationName()));
		// list.forEach(l->System.out.println(l));

		// java 8+ stream and comparator interface ASC and remove duplicate
		List<UserRegistration> modifiedAscList = list.stream()
				.filter(p -> p.getUserRegistrationId() > 10)
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
				.stream()
				.collect(Collectors.toList());

		modifiedAscList.forEach(l->System.out.println("modifiedAscList:" +l));

		// java 8+ stream and comparator interface ASC and remove duplicate
		List<UserRegistration> modifiedDescList = list.stream()
				.filter(p -> p.getUserRegistrationId() > 10)
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())))
				.stream()
				.collect(Collectors.toList());

		modifiedDescList.forEach(l -> System.out.println("modifiedDescList:"+ l));

		List<UserRegistration> modifiedDescList2 = list.stream()
				.filter(p -> p.getUserRegistrationId() >= 10)
				.map(p -> p)
				.collect(Collectors.toList());
		modifiedDescList2.forEach(l->System.out.println("modifiedDescList2:"+ l));

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

	public static void main(String[] args) {
		 arrayListPrimitive();
		// linkedListPrimitive();
		// vectorPrimitive();
		// stackPrimitive();
		// priorityQueuePrimitive();

		// sortCustomObject();
		// removeDuplicateAndSortedFromList();

	}

}
