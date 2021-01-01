package com.uvsoftgroup.bp.uvsoftgroupjavabp.predicateexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;

public class PredicateExercise {

	public static void predicateAndOrCheck() {
		Predicate<String> startWithA = x -> x.startsWith("u");
		// start with "u" or "v"
		boolean resultOr = startWithA.or(x -> x.startsWith("u")).test("uvsotgroup");
		boolean resultAnd = startWithA.and(x -> x.startsWith("v")).test("uvsotgroup");
		System.out.println(resultOr); // true
		System.out.println(resultAnd); // false

	}

	public static void predicateAndOrCheckForUserDefinedObject() {
		List<UserRegistration> list = setUserRegistrationData();

		Predicate<UserRegistration> predNameWith = x -> x.getUserRegistrationName().startsWith("Test");
		List<UserRegistration> listPredicate = filterUserRegistration(list, predNameWith);
		listPredicate.forEach(l -> System.out.println(l));

		Predicate<UserRegistration> pred1 = c -> c.getUserRegistrationName().startsWith("Test")
				&& c.getUserRegistrationId() > 12;

		List<UserRegistration> predicateList = list.stream().filter(pred1).collect(Collectors.toList());

		predicateList.forEach(l -> System.out.println(l));
	}

	public static List<UserRegistration> filterUserRegistration(List<UserRegistration> userRegistrations,
			Predicate<UserRegistration> predicate) {

		return userRegistrations.stream().filter(predicate).collect(Collectors.toList());
	}

	public static List<String> setArrayListPrimitive() {
		// Creating arraylist
		ArrayList<String> listString = new ArrayList<String>();
		// Adding object in arraylist
		listString.add("A");
		listString.add("RR");
		listString.add("KK");
		listString.add("HH");
		listString.add("hh");
		return listString;
	}

	private static List<UserRegistration> setUserRegistrationData() {
		List<UserRegistration> list = new ArrayList<UserRegistration>();

		UserRegistration ur3 = new UserRegistration();
		ur3.setUserRegistrationId(12L);
		ur3.setUserAddressId(103L);
		ur3.setUserRegistrationName("Test003");
		ur3.setUserRegistrationfullName("ab");

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
		predicateAndOrCheckForUserDefinedObject();
		// predicateAndOrCheck();

	}

}
