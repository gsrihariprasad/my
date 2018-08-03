package com.sriharilabs.java8.practice;

import java.util.function.Consumer;

public class CapturingValuess {

	public static void main(String[] args) {
		final int secret1 = 42;
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter3 =
					msg -> System.out.println("Consuming " + msg + ", " + secret1);
			
			myPrinter3.accept(myPrinter3.toString());
		}
		System.out.println("...........................");
		new CapturingValuess().show1();
		System.out.println("...........................");
		new CapturingValuess().show2();;
		
	}
	
	static int secret2 = 42;
	public void show1() {
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter3 =
					msg -> System.out.println("Consuming " + msg + ", " + secret2);
			
			myPrinter3.accept(myPrinter3.toString());
		}
	}
		int secret3 = 42;
		public void show2() {
			for (int i=0; i<5; i++) {
				Consumer<String> myPrinter3 =
						msg -> System.out.println("Consuming " + msg + ", " + secret3);
				
				myPrinter3.accept(myPrinter3.toString());
			}
	}

}
