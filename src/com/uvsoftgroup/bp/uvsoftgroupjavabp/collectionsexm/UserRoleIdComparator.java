package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Comparator;

public class UserRoleIdComparator implements Comparator<UserRole> {

	@Override
	public int compare(UserRole ur1, UserRole url2) {

		if (ur1.userRoleId == url2.userRoleId)
			return 0;
		else if (url2.userRoleId > url2.userRoleId)
			return 1;
		else
			return -1;
	}
}