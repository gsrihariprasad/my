package com.sriharilabs.streams.java2novice;

import java.util.Arrays;
import java.util.List;

public class converts_string_elements_uppercase {
	public static void main(String a[]) {
	List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
	vehicles.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}
