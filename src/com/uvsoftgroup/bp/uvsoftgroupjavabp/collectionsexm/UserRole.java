/**
 * 
 */
package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Date;

public class UserRole implements Comparable<UserRole> {

	Long userRoleId;
	String userRoleName, userRoleType;
	Date userRoleDate;

	// override equals and hashCode
	@Override
	public int compareTo(UserRole ur) {
		if (this.userRoleId > ur.userRoleId) {
			return 1;
		} else if (this.userRoleId < ur.userRoleId) {
			return -1;
		} else {
			return 0;
		}
	}

	public UserRole(Long userRoleId, String userRoleName, String userRoleType, Date userRoleDate) {
		super();
		this.userRoleId = userRoleId;
		this.userRoleName = userRoleName;
		this.userRoleType = userRoleType;
		this.userRoleDate = userRoleDate;
	}

	public UserRole() {
		super();
	}

	// getters, setters

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		UserRole userRole = (UserRole) obj;
		return userRoleId == userRole.userRoleId
				&& (userRoleName == userRole.userRoleName
						|| (userRoleName != null && userRoleName.equals(userRole.getUserRoleName())))
				&& (userRoleType == userRole.userRoleType
						|| (userRoleType != null && userRoleType.equals(userRole.getUserRoleType())));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userRoleName == null) ? 0 : userRoleName.hashCode());
		result = (int) (prime * result + userRoleId);
		result = prime * result + ((userRoleType == null) ? 0 : userRoleType.hashCode());
		return result;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public String getUserRoleType() {
		return userRoleType;
	}

	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}

	public Date getUserRoleDate() {
		return userRoleDate;
	}

	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleId=" + userRoleId + ", userRoleName=" + userRoleName + ", userRoleType="
				+ userRoleType + ", userRoleDate=" + userRoleDate + "]";
	}

}
