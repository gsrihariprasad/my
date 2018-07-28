package com.sriharilabs.streams.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortedEx {
	public static void main(String a[]) {
		
		
		Stream<String> stream=Stream.of("car","bus","scooter","lorry","airplane","honda","car1","car2");
		
		stream.sorted().forEach(System.out::println);
		
		System.out.println("-------------");
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee e1=new Employee("srihari","hadoop develper",100000);
		Employee e2=new Employee("gshp","java develper",99000);
		Employee e3=new Employee("hari","DataScience",120000);
		Employee e4=new Employee("prasad","AL develper",150000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		List<Employee> sortedlist=list.stream()
		.sorted((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary()))
		.collect(Collectors.toList());
		
		sortedlist.forEach(s->System.out.println( s.getName()+"       :  "+ s.getSalary()));
		
	}
	}
