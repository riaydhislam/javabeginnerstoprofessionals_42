package com.uvsoftgroup.bp.uvsoftgroupjavabp.sortingexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;

public class SortingExercise {

	public static void getWrapperDataListSorted() {
		List<String> list=setStringData();
		
		// Collections sort
		//Collections.sort(list);
		//list.forEach(l->System.out.println(l));
		
		//Collections.sort(list, Collections.reverseOrder());
		//list.forEach(l->System.out.println(l));
		
		// stream sort 
		List<String> sortedList =list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(l->System.out.println(l));
		
	    List<String> reverseSortedList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	    reverseSortedList.forEach(l->System.out.println(l));   

	}

	public static void getUserdefinedObjectListSorted() {
		List<UserRegistration> list =setUserRegistrationData();
		
	    Comparator<UserRegistration> idComparator = (ur1,ur2) -> ur1.getUserRegistrationId().compareTo(ur2.getUserRegistrationId());
	    Comparator<UserRegistration> nameComparator = (UserRegistration ur1, UserRegistration ur2) -> ur1.getUserRegistrationName().compareTo(ur2.getUserRegistrationName());
	      
		// to list sort method with 
		// 
		//list.sort(idComparator);
		//list.forEach(l->System.out.println(l));
		
		//list.sort(idComparator.reversed());
		//list.forEach(l->System.out.println(l));
	    
	   // list.sort(idComparator.thenComparing(nameComparator));
	   // list.forEach(l->System.out.println(l));
	    
	   // list.sort(idComparator.thenComparing(nameComparator).reversed());
	   // list.forEach(l->System.out.println(l));
	    
	  //  list.sort(Comparator.nullsLast(idComparator.reversed()));
	  //  list.forEach(l->System.out.println(l));
	    
		// collections
		// Collections.sort(list,Comparator.nullsLast(nameComparator));
		// list.forEach(l->System.out.println(l));
		 
		// Collections.sort(list,Comparator.nullsLast(nameComparator).reversed());
		// list.forEach(l->System.out.println(l));
	    
	     // Collections.sort(list, idComparator.thenComparing(nameComparator));
		 // list.forEach(l->System.out.println(l));
		 
		 // Collections.sort(list,idComparator.thenComparing(nameComparator).reversed());
		 // list.forEach(l->System.out.println(l));
	    
		 Comparator<UserRegistration> cmId=Comparator.comparing(UserRegistration::getUserRegistrationId);  
		 Comparator<UserRegistration> cmName=Comparator.comparing(UserRegistration::getUserRegistrationName,Comparator.nullsLast(String::compareTo));
		 Comparator<UserRegistration> cmIdAndName=cmId.thenComparing(cmName);
		 
		 Comparator<UserRegistration> cm1=Comparator.comparing(UserRegistration::getUserRegistrationName,Comparator.nullsLast(String::compareTo));  
		 Comparator<UserRegistration> cmf=Comparator.comparing(UserRegistration::getUserRegistrationName,Comparator.nullsFirst(String::compareToIgnoreCase));  
		    
		 
		// comparator
		 // Collections.sort(list, cmIdAndName);
		// list.forEach(l->System.out.println(l));
		 
		// Collections.sort(list, cmIdAndName.reversed());
		// list.forEach(l->System.out.println(l));
	    
	    // stream
	    //List<UserRegistration> sortedAscList =list.stream()
		 //.sorted(idComparator.thenComparing(nameComparator))
		 //.collect(Collectors.toList());
	    //sortedAscList.forEach(l->System.out.println(l));
	    
	    //List<UserRegistration> sortedDescList =list.stream()
		 //.sorted(idComparator.thenComparing(nameComparator).reversed())
		 //.collect(Collectors.toList());
	    //sortedDescList.forEach(l->System.out.println(l));
		 
	    
	    //List<UserRegistration> sortedListAsc = list.stream()
	    //	      .sorted(cmId)
	    //	      .collect(Collectors.toList());
	    
	   // sortedListAsc.forEach(l->System.out.println(l));
	    
	    List<UserRegistration> reverseSortedList = list.stream()
	    	      .sorted(cmId.thenComparing(cmName))
	    	      .collect(Collectors.toList());
	    
	    reverseSortedList.forEach(l->System.out.println(l));
	    
	}

	private static List<UserRegistration> setUserRegistrationData() {
		List<UserRegistration> list = new ArrayList<UserRegistration>();

		UserRegistration ur3 = new UserRegistration();
		ur3.setUserRegistrationId(12L);
		ur3.setUserAddressId(103L);
		ur3.setUserRegistrationName("Test003");

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
		ur4.setUserRegistrationName("Test001");

		UserRegistration ur5 = new UserRegistration();
		ur5.setUserRegistrationId(null);
		ur5.setUserRegistrationName(null);

		list.add(ur3);
		list.add(ur1);
		list.add(ur2);
		list.add(ur4);
		//list.add(ur5);

		return list;
	}

	private static List<String> setStringData() {
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("B");
		listString.add("A");
		listString.add("C");
		return listString;
	}

	public static void main(String[] args) {
		// getWrapperDataListSorted();
		 getUserdefinedObjectListSorted();
	}

}
