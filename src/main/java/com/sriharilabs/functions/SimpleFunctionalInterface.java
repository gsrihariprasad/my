package com.sriharilabs.functions;

public class SimpleFunctionalInterface {

	
	interface Simple{
		
		public int show();
	}
	
	public int getInt() {
		return 120;
	}
	
	
	
	public static void main(String as[]) {
		SimpleFunctionalInterface sf=new SimpleFunctionalInterface();
		Simple s1=sf::getInt;
		
		System.out.println(s1.show());
		
		
		Simple s2=()->{
			return sf.getInt();
		};
		
		//Compile time Exception that is target type must be a functional interface
/**		Simple s3=()->{
			return sf::getInt;
		};
**/
		
		
		
	}
}
