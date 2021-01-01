package com.uvsoftgroup.bp.uvsoftgroupjavabp.controlstatement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;

public class ControlStatementExercise {
	
   /**
    * 
    * @param plotCodeKey
    * @return
    */
	public static String ifElseLadderStatement(int plotCodeKey) {

		if (plotCodeKey == 1) {
			return "Residential";
		} else if (plotCodeKey == 2) {
			return "Commercial";
		} else if (plotCodeKey == 3) {
			return "Industrial";
		} else {
			return "No Category";
		}

	}
/**
 * 
 * @param plotCodeKey
 * @return
 */
	public static String switchCaseToReplaceIfElseLadder(int plotCodeKey) {

		switch(plotCodeKey) {
		// switch cases without break statements
		case 1:
			return "Residential";
		case 2:
			return "Commercial";
		case 3:
			return "Industrial";
		default:
			return "No Category";
		}
	}
/**
 * 
 * @param branch
 * @param year
 */
	public static void nestedSwitchStatement(char branch, int year) {
		// Nested Switch Statement
		switch (year) {
		case 1:
			System.out.println("English, Maths");
			break;
		case 2:
			switch (branch) {
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'M':
				System.out.println("Maths 2");
				break;
			}
			break;
		case 3:
			switch (branch) {
			case 'C':
				System.out.println("Computer Organization, MultiMedia");
				break;
			case 'M':
				System.out.println("Maths 3");
				break;
			}
			break;
		case 4:
			switch (branch) {
			case 'C':
				System.out.println("Data Communication and Networks, MultiMedia");
				break;
			case 'M':
				System.out.println("Maths 4");
				break;
			}
			break;
		}

	}
	/**
	 * 
	 * @param prefix
	 * @return
	 */
	protected static List<UserRegistration> forLoopWithIfElse(String prefix) {
		List<UserRegistration> list = setUserRegistrationData();
		List<UserRegistration> listResult = new ArrayList<UserRegistration>();
		for (UserRegistration ur : list) {
			if (ur.getUserRegistrationName().startsWith(prefix)) {
				UserRegistration userRegistration = new UserRegistration();
				userRegistration.setUserRegistrationId(ur.getUserRegistrationId());
				userRegistration.setUserRegistrationName(ur.getUserRegistrationName());
				userRegistration.setUserAddressId(ur.getUserAddressId());
				listResult.add(userRegistration);

			}
		}
		if (!listResult.isEmpty()) {
			return listResult;
		} else {
			return new ArrayList<UserRegistration>(listResult);
		}
	}
	
	/**
	 * 
	 * @param prefix
	 * @return
	 */
	static List<UserRegistration> forLoopWithIfElseJava8(String prefix) {
		List<UserRegistration> list = setUserRegistrationData();
		Comparator<UserRegistration> comId=Comparator.comparing(UserRegistration::getUserRegistrationId);
		List<UserRegistration> modifiedList = list.stream()
				.filter(ur->ur.getUserRegistrationName().startsWith(prefix))
				.sorted(comId.reversed())
				.collect(Collectors.toList());
	  return modifiedList;
		
	}
	
/**
 * 
 */
	public static void forLoopBreakAndContinue() {
		// Code of Java for loop
		int term = 10;
		for (int i = 1; i <= term; i++) {
			for (int j = term; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}

		// Using Label for outer and for loop
		aa: 
			for (int i = 1; i <= 3; i++) {
			bb: 
				for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
		
		//Using no condition in for loop 
		//for(;;){ 
		//	System.out.println("infinitive loop"); 
		//}
		 

	}
/**
 * 
 */
	public static void whileLoopBreakAndContinue() {
		int i = 1;
		while (i <= 10) {
		    if(i==5){  
	          //using continue statement  
	            i++;  
	          //it will skip the rest statement  
	            break;
	        } 
			System.out.println(i);
			i++;
		}
		
		 // Infinitive While Loop while(true){ System.out.println(
		 // "infinitive while loop"); }
		 
	}

	public static void doWhileLoopBreakAndContinue() {
		int i = 1;
		do {
			 if(i==5){  
		          //using continue statement  
		            i++;  
		          //it will skip the rest statement  
		            continue;
		        }
			 
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		//Infinitive do-while Loop 
		//do{ 
		//System.out.println("infinitive do while loop"); 
		//} while (true);
		 
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
		ur4.setUserRegistrationName("Real003");
		ur4.setUserRegistrationfullName("ab");

		list.add(ur3);
		list.add(ur1);
		list.add(ur2);
		list.add(ur4);

		return list;
	}

}
