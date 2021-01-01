package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectorsexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.PlotInfo;
import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;

public class CollectorsExercise {
	
	
	private static void exercises(){
		Comparator<PlotInfo> idComp=Comparator.comparing(PlotInfo::getPlId);
		Comparator<PlotInfo> nameComp=Comparator.comparing(PlotInfo::getPlName);
		Comparator<PlotInfo> nameSort = (p1, p2) -> p1.getPlName().compareTo(p2.getPlName());
		Comparator<PlotInfo> cmId = Comparator.comparing(PlotInfo::getPlId);
		Comparator<PlotInfo> cmf = Comparator.comparing(PlotInfo::getPlName,
				Comparator.nullsFirst(String::compareToIgnoreCase));
		
		List<PlotInfo> list=setPlotInfo();
		List<PlotInfo> listResult=list.stream().sorted(idComp.reversed()).collect(Collectors.toList());
		// listResult.forEach(l->System.out.println(l));
		PlotInfo[] plotInfos = list.stream().toArray(PlotInfo[]::new);
		for(PlotInfo ob:plotInfos){
			System.out.println(ob.getPlId());
		}
		
		 //Getting the avgPrice
	      Double avgPrice =list.stream()   
	          .collect(Collectors.averagingDouble(s->s.getPlPrice()));  
	      System.out.println("Average Price of PlotInfo: "+avgPrice);
	      
	      DoubleSummaryStatistics stats =list.stream()
	    	      .collect(Collectors.summarizingDouble(PlotInfo::getPlPrice));
	      
	      System.out.println(String.format("%S", stats.toString()));
	      
		
		
	
	}
	
	
	private static List<PlotInfo> setPlotInfo() {
		List<PlotInfo> plotInfoList = new ArrayList<>();

		PlotInfo plotInfo1 = new PlotInfo();
		plotInfo1.setPlId(100);
		plotInfo1.setPlPrice(100.50);
		plotInfo1.setPlName("AR");

		PlotInfo plotInfo2 = new PlotInfo();
		plotInfo2.setPlId(102);
		plotInfo2.setPlPrice(150.00);
		plotInfo2.setPlName("BI");

		PlotInfo plotInfo3 = new PlotInfo();
		plotInfo3.setPlId(103);
		plotInfo3.setPlPrice(160.00);
		plotInfo3.setPlName("CC");

		PlotInfo plotInfo4 = new PlotInfo();
		plotInfo4.setPlId(100);
		plotInfo4.setPlPrice(170.00);
		plotInfo4.setPlName("CC");

		//Optional<PlotInfo> plotInfo4Optional = Optional.of(plotInfo4);
		
		plotInfoList.add(plotInfo3);
		plotInfoList.add(plotInfo1);
		plotInfoList.add(plotInfo2);
		plotInfoList.add(plotInfo4);

		return plotInfoList;
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
	
	public static void main(String[] args) {
		exercises();
		
	}

}
