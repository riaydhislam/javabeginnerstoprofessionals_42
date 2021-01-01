package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapExercise {

	public static void hashMapExamPrimitiveWarapperclass() {
		// Map<String, Integer> unSortedMap = getUnSortedHashMap();
		Map<Integer, String> unSortedMap = getUnSortedHashMap1();

		// Elements can traverse in any order
		for (Map.Entry m : unSortedMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

		// Returns a Set view of the mappings contained in this map
		unSortedMap.entrySet()
				// Returns a sequential Stream with this collection as its
				// source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map:" + sortedMap);

		// LinkedHashMap<String, Integer> reverseSortedMap = new
		// LinkedHashMap<>();

		LinkedHashMap<Integer, String> reverseSortedMap = new LinkedHashMap<>();

		// Returns a Set view of the mappings contained in this map
		unSortedMap.entrySet()
				// Returns a sequential Stream with this collection as its
				// source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Reverse Sorted Map:" + reverseSortedMap);

	}

	public static void hashMapExamNonPrimitiveUserDefineObject() {
		Map<Integer, UserRole> map = getUnSortedUserDefinedObjectHashMap();
		// TreeMap by using its constructor
		// TreeMap<Integer, UserRole> sortedMap = new TreeMap<>();
		// putAll method to copy the data
		// sortedMap.putAll(map);
		// System.out.println("Sorted Map:" + sortedMap);

		Map<Integer, UserRole> sortedAscByKey = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole> comparingByKey())
				.collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));

		// System.out.println("sortedAscByKey:" + sortedAscByKey);

		Map<Integer, UserRole> sortedDesByKey = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole> comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, TreeMap::new));

		// System.out.println("sortedDesByKey:" + sortedDesByKey);
		
		Map<Integer, UserRole> sortedAscByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// System.out.println("sortedAscByValue:" + sortedAscByValue);
		
		Map<Integer, UserRole> sortedDscByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// System.out.println("sortedDscByValue:" + sortedDscByValue);
		
		
		Comparator<UserRole> idSort=(UserRole a, UserRole b)->a.getUserRoleId().compareTo(b.getUserRoleId());
		Comparator<UserRole> typeSort=(UserRole a, UserRole b)->a.getUserRoleType().compareTo(b.getUserRoleType());
		Comparator<UserRole> nameSort=(a,b)->a.getUserRoleName().compareTo(b.getUserRoleName());
		
		Comparator<UserRole> idAndNameSort=Comparator
                .comparing(UserRole::getUserRoleId)
                .thenComparing(UserRole::getUserRoleName);
		
		
		Map<Integer, UserRole> sortedAscComparatorByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue(typeSort))
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// System.out.println("sortedAscComparatorByValue:" + sortedAscComparatorByValue);
		
		Map<Integer, UserRole> sortedDesComparatorByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue(typeSort).reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// System.out.println("sortedDesComparatorByValue:" + sortedDesComparatorByValue);
		
		
		Map<Integer, UserRole> idAndNameSortAscComparatorByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue(nameSort))
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// System.out.println("idAndNameSortAscComparatorByValue:" + idAndNameSortAscComparatorByValue);
		
		
		Map<Integer, UserRole> idAndNameSortDesComparatorByValue = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, UserRole>comparingByValue(nameSort).reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, 
			               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("idAndNameSortDesComparatorByValue:" + idAndNameSortDesComparatorByValue);
		
		// Sort by Key
		List<Integer> urByKey = new ArrayList<>(map.keySet());
		Collections.sort(urByKey);
		//System.out.println("Sorted Map by key:" +urByKey);
		// Sort by value
		List<UserRole> urByValue = new ArrayList<>(map.values());
		Collections.sort(urByValue, Collections.reverseOrder());
		// System.out.println("Sorted Map by value:" + urByValue);

		Map<Integer, UserRole> filteredMap = filterByValue(map, x -> x.userRoleType.contains("EX"));
	
		// System.out.println(filteredMap);

		Comparator<UserRole> nameSort2 = (p1, p2) -> p1.getUserRoleName().compareTo(p2.getUserRoleName());
		Comparator<UserRole> cmId = Comparator.comparing(UserRole::getUserRoleId);

		Comparator<PlotInfo> cmf = Comparator.comparing(PlotInfo::getPlName,
				Comparator.nullsFirst(String::compareToIgnoreCase));
		
		
		List<UserRole> list =  map.entrySet()
				.stream()
				.map(e -> {
					UserRole r=new UserRole();	
					r.setUserRoleId(e.getValue().getUserRoleId());
					r.setUserRoleName(e.getValue().getUserRoleName());
					r.setUserRoleType(e.getValue().getUserRoleType());
					return r;
				})
				.sorted(cmId.reversed())
				.collect(Collectors.toList());
		
		list.forEach(l->System.out.println(l));
			
	}

	public static void linkedHashMapExamPrimitiveWarapperclass() {
		Map<String, Integer> linkedHashMap = getLinkedHashMap();
		System.out.println("linkedHashMap:" + linkedHashMap);

		Map<Integer, UserRole> map = getUserDefinedObjectLinkedHashMap();
		System.out.println("linkedHashMapUserdeined:" + map);

	}

	public static void treeMapExamPrimitiveWarapperclass() {
		Map<String, Integer> linkedHashMap = getTreeHashMap();
		System.out.println("treeMap:" + linkedHashMap);

		Map<Integer, UserRole> map = getUserDefinedObjectTreeMap();
		System.out.println("treeMapUserdefined:" + map);

	}

	private static Map<String, Integer> getLinkedHashMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 123);
		map.put("cc", 123);
		map.put("bb", 122);
		map.put("ee", 124);
		map.put("kk", 125);
		map.put(null, 126);
		return map;

	}

	private static Map<String, Integer> getTreeHashMap() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("aa", 123);
		map.put("cc", 123);
		map.put("bb", 122);
		map.put("ee", 124);
		map.put("kk", 125);
		// map.put(null, 126);
		return map;

	}

	private static Map<String, Integer> getUnSortedHashMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 123);
		map.put("cc", 123);
		map.put("bb", 122);
		map.put("ee", 124);
		map.put("kk", 125);
		map.put(null, 126);
		return map;

	}

	private static Map<Integer, String> getUnSortedHashMap1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(123, "aa");
		map.put(123, "cc");
		map.put(122, "bb");
		map.put(124, "ee");
		map.put(125, "kk");
		map.put(null, "");
		return map;

	}

	public static Map<Integer, UserRole> getUserDefinedObjectLinkedHashMap() {

		Map<Integer, UserRole> map = new LinkedHashMap<>();

		UserRole ur1 = new UserRole();
		ur1.setUserRoleId(105L);
		ur1.setUserRoleName("Admin");
		ur1.setUserRoleType("AD");

		UserRole ur11 = new UserRole();
		ur11.setUserRoleId(105L);
		ur11.setUserRoleName("Admin");
		ur11.setUserRoleType("AD");

		UserRole ur2 = new UserRole();
		ur2.setUserRoleId(102L);
		ur2.setUserRoleName("Executive");
		ur2.setUserRoleType("EX");

		UserRole ur3 = new UserRole();
		ur3.setUserRoleId(103L);
		ur3.setUserRoleName("Suervisor");
		ur3.setUserRoleType("SU");

		UserRole ur4 = new UserRole();
		ur4.setUserRoleId(104L);
		ur4.setUserRoleName("Officer");
		ur4.setUserRoleType("OF");

		System.out.println("equals:" + ur1.equals(ur11)); // true

		map.put(7, ur3);
		map.put(1, ur1);
		map.put(10, ur11);
		map.put(4, ur4);
		map.put(2, ur2);

		return map;

	}

	public static Map<Integer, UserRole> getUnSortedUserDefinedObjectHashMap() {

		Map<Integer, UserRole> map = new HashMap<>();

		UserRole ur1 = new UserRole();
		ur1.setUserRoleId(105L);
		ur1.setUserRoleName("Admin");
		ur1.setUserRoleType("AD");

		UserRole ur11 = new UserRole();
		ur11.setUserRoleId(105L);
		ur11.setUserRoleName("Admin");
		ur11.setUserRoleType("AD");

		UserRole ur2 = new UserRole();
		ur2.setUserRoleId(102L);
		ur2.setUserRoleName("Executive");
		ur2.setUserRoleType("EX");

		UserRole ur3 = new UserRole();
		ur3.setUserRoleId(103L);
		ur3.setUserRoleName("Suervisor");
		ur3.setUserRoleType("SU");

		UserRole ur4 = new UserRole();
		ur4.setUserRoleId(104L);
		ur4.setUserRoleName("Officer");
		ur4.setUserRoleType("OF");

		System.out.println("equals:" + ur1.equals(ur11)); // true

		map.put(7, ur3);
		map.put(1, ur1);
		map.put(10, ur11);
		map.put(4, ur4);
		map.put(2, ur2);

		return map;

	}

	public static Map<Integer, UserRole> getUserDefinedObjectTreeMap() {

		Map<Integer, UserRole> map = new TreeMap<>();

		UserRole ur1 = new UserRole();
		ur1.setUserRoleId(105L);
		ur1.setUserRoleName("Admin");
		ur1.setUserRoleType("AD");

		UserRole ur11 = new UserRole();
		ur11.setUserRoleId(105L);
		ur11.setUserRoleName("Admin");
		ur11.setUserRoleType("AD");

		UserRole ur2 = new UserRole();
		ur2.setUserRoleId(102L);
		ur2.setUserRoleName("Executive");
		ur2.setUserRoleType("EX");

		UserRole ur3 = new UserRole();
		ur3.setUserRoleId(103L);
		ur3.setUserRoleName("Suervisor");
		ur3.setUserRoleType("SU");

		UserRole ur4 = new UserRole();
		ur4.setUserRoleId(104L);
		ur4.setUserRoleName("Officer");
		ur4.setUserRoleType("OF");

		System.out.println("equals:" + ur1.equals(ur11)); // true

		map.put(7, ur3);
		map.put(1, ur1);
		map.put(10, ur11);
		map.put(4, ur4);
		map.put(2, ur2);

		return map;

	}

	// Generic Map filter by value, with predicate
	public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
		return map.entrySet().stream().filter(x -> predicate.test(x.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	public static void main(String args[]) {
		// hashMapExamPrimitiveWarapperclass();
		hashMapExamNonPrimitiveUserDefineObject();
		// linkedHashMapExamPrimitiveWarapperclass();
		// treeMapExamPrimitiveWarapperclass();
	}

}
