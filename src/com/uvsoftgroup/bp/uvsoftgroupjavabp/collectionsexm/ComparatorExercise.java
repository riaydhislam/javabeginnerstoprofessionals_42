package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorExercise {

	public static void collectionsAndComparatorExam() {
		List<UserRole> userRoleList = setUserRole();

		Collections.sort(userRoleList, new UserRoleIdComparator());

		// userRoleList.forEach(l->System.out.println(l));

		Collections.sort(userRoleList, new UserRoleTypeComparator());

		// userRoleList.forEach(l->System.out.println(l));

		// Java 8+
		Comparator<UserRole> comUserRoleType = Comparator.comparing(UserRole::getUserRoleType);
		Collections.sort(userRoleList, comUserRoleType);

		// userRoleList.forEach(l->System.out.println(l));

		Comparator<UserRole> comUserRoleType2 = Comparator.comparing(UserRole::getUserRoleType,
				Comparator.nullsFirst(String::compareTo));
		Collections.sort(userRoleList, comUserRoleType2);

		// userRoleList.forEach(l->System.out.println(l));
		

		Comparator<UserRole> comUserRoleType3 = Comparator.comparing(UserRole::getUserRoleType,
				Comparator.nullsLast(String::compareTo));
		Collections.sort(userRoleList, comUserRoleType3);

		 userRoleList.forEach(l->System.out.println(l));
		 
		 Comparator<UserRole> userRoleNameSort = (ur1, ur2) -> ur1.getUserRoleName()
					.compareTo(ur2.getUserRoleName());

		// implementing lambda expression
		Collections.sort(userRoleList, userRoleNameSort);

		// userRoleList.forEach(l->System.out.println(l));
	}

	public static List<UserRole> setUserRole() {
		List<UserRole> userRoleList = new ArrayList<>();
		UserRole ur1 = new UserRole();
		ur1.setUserRoleId(1L);
		ur1.setUserRoleName("Admin");
		ur1.setUserRoleType("AD");
		UserRole ur2 = new UserRole();
		ur2.setUserRoleId(3L);
		ur2.setUserRoleName("Executive");
		ur2.setUserRoleType("EX");
		UserRole ur3 = new UserRole();
		ur3.setUserRoleId(2L);
		ur3.setUserRoleName("Suervisor");
		ur3.setUserRoleType("SU");

		UserRole ur4 = new UserRole();
		ur4.setUserRoleId(4L);
		ur4.setUserRoleName("Suervisor");
		ur4.setUserRoleType("");

		userRoleList.add(ur1);
		userRoleList.add(ur2);
		userRoleList.add(ur3);
		userRoleList.add(ur4);

		return userRoleList;
	}

	public static void main(String[] args) {
		collectionsAndComparatorExam();
	}

}
