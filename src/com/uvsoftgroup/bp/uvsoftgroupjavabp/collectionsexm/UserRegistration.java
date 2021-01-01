package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Date;
import java.util.List;

public class UserRegistration {
	Long userRegistrationId;
	Long userAddressId;
	String userRegistrationFName, userRegistrationMName, userRegistrationLName, userRegistrationName;
	String userRegistrationPassword, userRegistrationfullName;
	Date userRegistrationCrDate, userRegistrationLDate;

	private List<UserRole> userRoles;
	

	public Long getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(Long userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public Long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getUserRegistrationFName() {
		return userRegistrationFName;
	}

	public void setUserRegistrationFName(String userRegistrationFName) {
		this.userRegistrationFName = userRegistrationFName;
	}

	public String getUserRegistrationMName() {
		return userRegistrationMName;
	}

	public void setUserRegistrationMName(String userRegistrationMName) {
		this.userRegistrationMName = userRegistrationMName;
	}

	public String getUserRegistrationLName() {
		return userRegistrationLName;
	}

	public void setUserRegistrationLName(String userRegistrationLName) {
		this.userRegistrationLName = userRegistrationLName;
	}

	public String getUserRegistrationName() {
		return userRegistrationName;
	}

	public void setUserRegistrationName(String userRegistrationName) {
		this.userRegistrationName = userRegistrationName;
	}

	public String getUserRegistrationPassword() {
		return userRegistrationPassword;
	}

	public void setUserRegistrationPassword(String userRegistrationPassword) {
		this.userRegistrationPassword = userRegistrationPassword;
	}

	public String getUserRegistrationfullName() {
		return userRegistrationfullName;
	}

	public void setUserRegistrationfullName(String userRegistrationfullName) {
		this.userRegistrationfullName = userRegistrationfullName;
	}

	public Date getUserRegistrationCrDate() {
		return userRegistrationCrDate;
	}

	public void setUserRegistrationCrDate(Date userRegistrationCrDate) {
		this.userRegistrationCrDate = userRegistrationCrDate;
	}

	public Date getUserRegistrationLDate() {
		return userRegistrationLDate;
	}

	public void setUserRegistrationLDate(Date userRegistrationLDate) {
		this.userRegistrationLDate = userRegistrationLDate;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "UserRegistration [userRegistrationId=" + userRegistrationId + ", userAddressId=" + userAddressId
				+ ", userRegistrationFName=" + userRegistrationFName + ", userRegistrationMName="
				+ userRegistrationMName + ", userRegistrationLName=" + userRegistrationLName + ", userRegistrationName="
				+ userRegistrationName + ", userRegistrationPassword=" + userRegistrationPassword
				+ ", userRegistrationfullName=" + userRegistrationfullName + ", userRegistrationCrDate="
				+ userRegistrationCrDate + ", userRegistrationLDate=" + userRegistrationLDate + ", userRoles="
				+ userRoles + "]";
	}

}
