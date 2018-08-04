package com.sriharilabs.streams.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;

public class Join_two_different_types_of_lists {

	
	public static void merge1(List<Pair<Integer, String>> list1,List<String> list2) {
		Stream stream = Stream.concat(list1.stream(), list2.stream());

	    List<Pair<Integer, String>> res =  (List<Pair<Integer, String>>) stream.flatMap(item -> {
	            	
	            	System.out.println(item.getClass());
	                if (item instanceof String) {
	                	
	                    return new Pair<>(0, item);
	                }
	                else {
	                    return new Pair<>(((Pair<Integer, String>)item).getKey(), ((Pair<Integer, String>)item).getValue());
	                }
	            })
	            .collect(Collectors.toList());
	    
	    res.forEach(s->System.out.println(s.getKey()+ "   ::   "+s.getValue()));
	}
	
	
	
	public static void merge2(List<Pair<Integer, String>> list1,List<String> list2) {
		
		List<Pair<Integer, ? extends Object>> res =Stream.of(list1,list2)
														.flatMap(l-> l.stream().map(item -> {
	            	
	                if (item instanceof String) {
	                	
	                    return new Pair<>(0, item);
	                }
	                else {
	                    return new Pair<>(((Pair<Integer, String>)item).getKey(), ((Pair<Integer, String>)item).getValue());
	                }
	            })).collect(Collectors.toList());
		 res.forEach(s->System.out.println(s.getKey()+ "   ::   "+s.getValue()));
	}

	public static void merge3(List<Pair<Integer, String>> list1,List<String> list2) {
		
		@SuppressWarnings("unchecked")
		List<Pair<Integer, ? extends Object>> res =Stream.of(list1,list2).flatMap(l-> l.stream().map(item -> {
	            	
	                if (item instanceof String) {
	                	
	                    return new Pair<>(0, item);
	                }
	                else {
	                    return new Pair<>(((Pair<Integer, String>) item).getKey(), ((Pair<Integer, String>)item).getValue());
	                }
	            })).collect(Collectors.toList());
		 res.forEach(s->System.out.println(s.getKey()+ "   ::   "+s.getValue()));
	}
	
	public static void main(String as[]) {

	    List<Pair<Integer, String>> list1 = new ArrayList<>();
	    List<String> list2 = new ArrayList<>();
	    
	    list1.add(new Pair<>(1, "werwe"));
	    list1.add(new Pair<>(2, "tyutyu"));
	    
	    list2.add("asd");
	    list2.add("asdaf");
	    merge2(list1,list2);

	}
}
