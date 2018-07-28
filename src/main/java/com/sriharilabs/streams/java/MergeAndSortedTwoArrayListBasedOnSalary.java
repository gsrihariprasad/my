package com.sriharilabs.streams.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortedTwoArrayListBasedOnSalary {
	public static void main(String a[]) {
		
		
		Stream<String> stream=Stream.of("car","bus","scooter","lorry","airplane","honda","car1","car2");
		
		//stream.sorted().forEach(System.out::println);
		
		System.out.println("-------------");
		
		List<Employee> list1=new ArrayList<Employee>();
		List<Employee> list2=new ArrayList<Employee>();
		List<Employee> listThird=new ArrayList<Employee>();
		
		Employee e1=new Employee("srihari","hadoop develper",100000);
		Employee e2=new Employee("gshp","java develper",99000);
		Employee e3=new Employee("hari","DataScience",120000);
		Employee e4=new Employee("prasad","AL develper",150000);
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);

		Employee emp1=new Employee("g_srihari","hadoop develper",100000);
		Employee emp2=new Employee("g_gshp","java develper",99000);
		Employee emp3=new Employee("g_hari","DataScience",120000);
		Employee emp4=new Employee("g_prasad","AL develper",150000);
		
		list2.add(emp1);
		list2.add(emp2);
		list2.add(emp3);
		list2.add(emp4);
		
		Employee emp5=new Employee("listThird_g_srihari","listThird_hadoop develper",100);
		Employee emp6=new Employee("listThird_g_gshp","listThird_java develper",90);
		listThird.add(emp5);
		listThird.add(emp6);
		/******************************************************************
		 * **************************************************************
		 */
		Stream<List<Employee>> list3=Stream.of(list1,list2);
		List<Employee> list4=list3.flatMap(l-> l.stream().map(g->g)).collect(Collectors.toList());
		
		//list4.forEach(s->System.out.println(s.getName()+"    "+s.getSalary()));
		
		List<Employee> list5=list4.stream()
								  .sorted((v1,v2)->v1.getSalary().compareTo(v2.getSalary()))
								  .collect(Collectors.toList());
		//list5.forEach(s->System.out.println(s.getName()+"  sorted::  "+s.getSalary()));
		
		/****************************************************
		 * **************************************************
		 */
		
		List<Employee> list6=Stream.concat(list1.stream(),list2.stream())
									.peek(f->System.out.println("1:::"+f.getName()))
									.collect(Collectors.toList()).stream()
									.peek(f->System.out.println("2:::"+f.getName()))
									.sorted((t1,t2)-> t1.getSalary().compareTo(t2.getSalary()))
									.peek(f->System.out.println("3:::"+f.getName()))
									.collect(Collectors.toList());
		//list6.forEach(e->System.out.println(e.getName()+":::  list6 ::   "+e.getSalary()));
		
		
		
		/******  Another Java 8 one-liner:  ******
		 * 
		 */
		List<Employee> newList1 = Stream.of(list1, list2)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
		
		/*********  As a bonus, since Stream.of() is variadic, 
		 * you may concatenate as many lists as you like.
		 */
		List<Employee> newList2 = Stream.of(list1, list2, listThird)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
		System.out.println("___________________________________________");
		newList2.forEach( p ->  System.out.println(p.getName()+"  ::  "+p.getSalary() ));
		
	}
	}