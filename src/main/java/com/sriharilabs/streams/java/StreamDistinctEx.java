package com.sriharilabs.streams.java;
import java.util.stream.Stream;


public class StreamDistinctEx {
	public static void main(String a[]) {
		Stream.of("bus", "car", "bycle", "bus", "car", "car", "bike")
			  .peek(s->System.out.println("LOG ::  "+s))
			  .distinct()
			  .peek(s->System.out.println("distic log: "+s))
			  .forEach(System.out::println);
		}
}