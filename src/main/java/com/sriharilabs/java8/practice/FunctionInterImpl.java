package com.sriharilabs.java8.practice;

public class FunctionInterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//()->System.out.println("this is srihari"); // compile time error
		FunctionInter f=(a)->{System.out.println("this is srihari"+a);};
		f.show(10);
	}

}
