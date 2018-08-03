package io.sriharilabs.generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsDemo<T> {

        T t;	
//public static void take(ArrayList<? extends T> list) {     
	//	Cannot make a static reference to the non-static type T
	
	public void take(ArrayList<? extends T> list) { 
		
		list.forEach(s->{
			System.out.println(s);
		});
		}
	
	
	public static void main(String[] args) {
		ArrayList<? extends Integer> foo3 = new ArrayList<Integer>();
		//foo3.add(1, new Integer(1));   
		
		ArrayList<Integer> listInteger  = new ArrayList<Integer>();
		 listInteger.add(1);
		 listInteger.add(4);
		 listInteger.add(3);
		 listInteger.add(8);
		 
		 
		 ExtendsDemo e=new ExtendsDemo();
		 e.take(listInteger);
		 
	}

}
