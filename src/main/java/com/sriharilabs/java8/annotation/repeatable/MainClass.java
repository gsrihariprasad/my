package com.sriharilabs.java8.annotation.repeatable;

public class MainClass {

	public static void main(String[] args) {
		for( MyInterface filter: MainInterce.class.getAnnotationsByType( MyInterface.class ) ) {
			
			System.out.println(filter.value());
		}
	}

}
