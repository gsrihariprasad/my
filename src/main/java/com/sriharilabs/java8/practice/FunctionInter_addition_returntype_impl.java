package com.sriharilabs.java8.practice;

public interface FunctionInter_addition_returntype_impl {

	public static void main(String as[]) {
		
		FunctionInter_addition_returntype f2=(a,b)-> { return a+b;};
		FunctionInter_addition_returntype f3=(a,b)-> (a+b);
		
		FunctionInter_addition_returntype f1=(int a,int b)-> { return a+b; };//Compilation error
		
		
		 
	}
}
