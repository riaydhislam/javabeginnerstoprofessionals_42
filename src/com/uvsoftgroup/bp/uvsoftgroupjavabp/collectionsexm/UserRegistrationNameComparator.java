package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Comparator;

public class UserRegistrationNameComparator implements Comparator<UserRegistration>{
 
    @Override
    public int compare(UserRegistration ur1, UserRegistration ur2) {
        return ur1.getUserRegistrationName().compareTo(ur2.getUserRegistrationName());
    }
}   
