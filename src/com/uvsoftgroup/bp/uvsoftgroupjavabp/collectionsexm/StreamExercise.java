package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {

	public static void streamApisExm() {
		List<PlotInfo> plotInfoList = setPlotInfo();
		List<BuildingInfo> buildingInfoList = setBuildingInfo();

		// filtering data
		List<Double> productPriceList2 = plotInfoList.stream()
				.filter(p -> p.plPrice > 150.50)
				.map(p -> p.plPrice) // fetching plPrice
				.collect(Collectors.toList()); // collecting as list

		//productPriceList2.forEach(l -> System.out.println(l));
		// filtering data
		double totalPriceFilter = plotInfoList.stream()
				.filter(p -> p.plPrice > 150.50).map(p -> p.plPrice)
				.reduce(0.0d,Double::sum); // accumulating plPrice, by referring method of Double class
		
		//System.out.println("totalPriceFilter:" + totalPriceFilter);

		// accumulating plPrice, by referring method of Double class
		double totalPrice = plotInfoList.stream()
				.map(p -> p.plPrice)
				.reduce(0.0d, Double::sum); 
		//System.out.println("totalPrice:" + totalPrice);

		// Using Collectors's method to sum the prices.
		double totalPrice2 = plotInfoList.stream()
				.collect(Collectors.summingDouble(p -> p.plPrice));
		//System.out.println("totalPrice2:" + totalPrice2);

		// max() method to get max Product price
		PlotInfo plotInfoMax = plotInfoList.stream()
				.max((p1, p2) -> p1.plPrice > p2.plPrice ? 1 : -1).get();

		// max() method to get max Product price
		PlotInfo plotInfoMin = plotInfoList.stream()
				.max((p1, p2) -> p1.plPrice < p2.plPrice ? 1 : -1).get();

		//System.out.println("Price:\nMax:" + plotInfoMax + "\nMin:" + plotInfoMin);

		long count = plotInfoList.stream()
				.filter(p -> p.plPrice > 140.00)
				.count();

		//System.out.println("count:" + count);

		List<PlotInfo> matchingObject = plotInfoList.stream()
				.filter(p -> p.plPrice > 150.00)
				.collect(Collectors.toList());
		//System.out.println("matchingObject:" + matchingObject.size());

		List<PlotInfo> filteredList = plotInfoList.stream()
				.filter(p -> p.plId > 101)
				.collect(Collectors.toList());

		//filteredList.forEach(l -> System.out.println(l));

		Comparator<PlotInfo> nameSort = (p1, p2) -> p1.getPlName().compareTo(p2.getPlName());
		Comparator<PlotInfo> cmId = Comparator.comparing(PlotInfo::getPlId);

		Comparator<PlotInfo> cmf = Comparator.comparing(PlotInfo::getPlName,
				Comparator.nullsFirst(String::compareToIgnoreCase));
		
		// remove duplicate elements from list
		List<PlotInfo> plotInfoListRemoveDuplicated = plotInfoList.stream()
				.filter(p -> p.getPlId() >= 100)
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId.reversed())))
				.stream()
				.collect(Collectors.toList());
		
		plotInfoListRemoveDuplicated.forEach(l->System.out.println(l));

		// Converting Product List into a Map with remove duplicate
		Map<Long, PlotInfo> plotInfoMap = plotInfoList.stream()
				.filter(p -> p.getPlId() >= 100)
				.collect(Collectors.toCollection(() -> new TreeSet<>(cmId)))
				.stream()
				.collect(Collectors.toMap(p -> p.plId, p -> p));
		
		
		plotInfoMap.forEach((k, v) -> System.out.println(k + ":" + v));
		
		List<PlotInfo> list = plotInfoMap.entrySet()
				.stream()
				.map(e -> {
					PlotInfo p=new PlotInfo();	
					p.setPlId(e.getValue().getPlId());
					p.setPlName(e.getValue().getPlName());
					return p;
				})
				.sorted(cmId.reversed())
				.collect(Collectors.toList()); 
			
		//list.forEach(l->System.out.println(l));
		

		Collections.sort(plotInfoList, cmId);
		//plotInfoList.forEach(l -> System.out.println(l));

		Collections.sort(plotInfoList, Collections.reverseOrder(cmId));
		//plotInfoList.forEach(l -> System.out.println(l));
		
		
	}

	public boolean priceIsInRange(PlotInfo plotInfo) {
		return Optional.ofNullable(plotInfo)
				.map(PlotInfo::getPlPrice)
				.filter(p -> p >= 150.00).filter(p -> p <= 160.00)
				.isPresent();
	}

	public static void givenOptionalThenCorrect() {
	    String password = " password ";
	    Optional<String> passOpt = Optional.of(password);
	    boolean correctPassword1 = passOpt.filter(pass -> pass.equals("password")).isPresent();
	   
	    System.out.println(correctPassword1);
	    
	    boolean correctPassword2 = passOpt
	      .map(String::trim)
	      .filter(pass -> pass.equals("password"))
	      .isPresent();
	    
	    System.out.println(correctPassword2);
	
	}
	
	private static List<BuildingInfo> setBuildingInfo() {
		List<BuildingInfo> buildingInfoList = new ArrayList<>();

		BuildingInfo buildingInfo1 = new BuildingInfo();
		buildingInfo1.setBuId(200);
		buildingInfo1.setBuPlId(100);

		BuildingInfo buildingInfo2 = new BuildingInfo();
		buildingInfo2.setBuId(300);
		buildingInfo2.setBuPlId(100);
		
		Optional<BuildingInfo> personOptional = Optional.of(buildingInfo1);

		buildingInfoList.add(buildingInfo1);
		buildingInfoList.add(buildingInfo2);
		
	

		
		return buildingInfoList;
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

	public static void main(String[] args) {
		streamApisExm();
		//givenOptionalThenCorrect();
	}

}
