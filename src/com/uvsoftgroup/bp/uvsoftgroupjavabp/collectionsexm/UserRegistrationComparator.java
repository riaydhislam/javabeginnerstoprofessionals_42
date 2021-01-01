package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Comparator;

public class UserRegistrationComparator implements Comparator<UserRegistration> {

	@Override
	public int compare(UserRegistration ur1, UserRegistration ur2) {
		if (ur1.userRegistrationId > ur2.userRegistrationId) {
			return 1;
		} else if (ur1.userRegistrationId < ur2.userRegistrationId) {
			return -1;
		} else {
			return 0;
		}
	}
}
