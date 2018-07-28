package com.sriharilabs.streams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Join_two_lists {

	/**          .flatMap(x -> x.stream())
	 * 
	 * As a bonus, since Stream.of() is variadic, you may concatenate as many lists
	 * as you like.
	 * 
	 * @param listOne
	 * @param listTwo
	 * @param listThree
	 */
	
	public static void way(List<Employee> listOne, List<Employee> listTwo, List<Employee> listThree) {
		//List<Employee> newList = Collections.addAll(listOne, listTwo.toArray());
		listOne.addAll(listTwo);
		listOne.addAll(listThree);
		listOne.stream().forEach(t->System.out.println(t.getName()+ "   ::   "+t.getSalary()));
	}
	public static void way1(List<Employee> listOne, List<Employee> listTwo, List<Employee> listThree) {
		List<Employee> newList = Stream.of(listOne, listTwo, listThree)
									   .flatMap(x -> x.stream())
									   .collect(Collectors.toList());
	}

	/**
	 * Another Java 8 one-liner:       .flatMap(Collection::stream)
	 * 
	 * @param listOne
	 * @param listTwo
	 * @param listThree
	 */

	public static void way2(List<Employee> listOne, List<Employee> listTwo, List<Employee> listThree) {
		List<Employee> newList = Stream.of(listOne, listTwo, listThree)
									   .flatMap(Collection::stream)
									   .collect(Collectors.toList());
		newList.forEach(s -> System.out.println(s.getName() + "     " + s.getSalary()));
	}

	
	/*** 				In Java 8 (the other way):   flatMap(List::stream)
	 * 
	 * @param as
	 */
	
	public static void way3(List<Employee> listOne, List<Employee> listTwo, List<Employee> listThree) {
		List<Employee> newList = 
				Stream.of(listOne, listTwo,listThree)
					  .flatMap(List::stream).collect(Collectors.toList());
		newList.forEach(s -> System.out.println(s.getName() + "     " + s.getSalary()));
	}
	
	
	/***
	 * here is a solution without flatMap
	 */
	
	public static void way4() {
		List<List<Integer>> lol = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),Arrays.asList(7, 8, 9),Arrays.asList(4, 5, 6));
	    List<Integer> li = lol.stream().collect(ArrayList::new, List::addAll, List::addAll);
	    System.out.println(lol);
	    System.out.println(li);
	}
	
	
	
	
	public static void main(String as[]) {

		List<Employee> list1 = new ArrayList<Employee>();
		List<Employee> list2 = new ArrayList<Employee>();
		List<Employee> list3 = new ArrayList<Employee>();

		Employee e1 = new Employee("srihari", "hadoop develper", 100000);
		Employee e2 = new Employee("gshp", "java develper", 99000);
		Employee e3 = new Employee("hari", "DataScience", 120000);
		Employee e4 = new Employee("prasad", "AL develper", 150000);

		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);

		Employee emp1 = new Employee("g_srihari", "hadoop develper", 100000);
		Employee emp2 = new Employee("g_gshp", "java develper", 99000);
		Employee emp3 = new Employee("g_hari", "DataScience", 120000);
		Employee emp4 = new Employee("g_prasad", "AL develper", 150000);

		list2.add(emp1);
		list2.add(emp2);
		list2.add(emp3);
		list2.add(emp4);

		Employee emp5 = new Employee("listThird_g_srihari", "listThird_hadoop develper", 100);
		Employee emp6 = new Employee("listThird_g_gshp", "listThird_java develper", 90);
		list3.add(emp5);
		list3.add(emp6);

		//way3(list1, list2, list3);
		way(list1, list2, list3);
		//way4();
	}
}
