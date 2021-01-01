package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Comparator;

public class UserRoleTypeComparator implements Comparator<UserRole> {

	@Override
	public int compare(UserRole ur1, UserRole ur2) {
		return ur1.userRoleType.compareTo(ur2.userRoleType);
	}
}