package com.uvsoftgroup.bp.uvsoftgroupjavabp.streamexm;

public class CollectionrsAndStreamExercise {
	
/*
Collection<Person> people = …;
Map<Integer, String> idToName =people.stream().collect(Collectors.toMap(Person::getTIN,Person::getName));
Collection<Person> people = …;
Map<Integer, Person> idToPerson =people.stream().collect(Collectors.toMap(Person::get TIN,Function.identity()));
Collection<Person> people = …;
Map<Address, List<Person>> addressToPerson =people.stream().collect(Collectors.toMap(Person::getAddress,
                   p->{
                   List<Person> p=new ArrayList<>(); 
                   tmp.add(p); 
                   return p;
                   },
                   (l1,l2)->{
                   l1.addAll(l2); 
                   return l1;
                   }
                  ));
 Collection<Person> people = …;

Map< Address ,List<Person>> addressToPerson =people.stream().collect(Collectors.collect(
Collectors.groupingBy(Person::getAddress));

  // The following statement filters cities having temp > 10  
      The map function transforms only  
       the names of the cities  
        The collect function collects the  
        output as a List  
        System.out.println(prepareTemperature().stream() 
                 .filter(f -> f.getTemperature() > 10) 
                 .map(f -> f.getName()) 
                 .collect(Collectors.toList()));  
                 
  System.out.println(prepareTemperature() 
                .stream() 
                .collect(Collectors.groupingBy( 
                            City::getName, 
                            Collectors.counting()))); 
        System.out.println(prepareTemperature() 
                .stream() 
                .collect(Collectors.groupingBy(City::getName)));
                
*/

}
