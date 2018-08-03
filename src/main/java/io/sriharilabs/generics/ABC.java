package io.sriharilabs.generics;

import java.util.ArrayList;
import java.util.List;

public class ABC {

	public static void main(String[] args) {

		
//		List<? super RationalNumber> containerOne = new ArrayList<RationalNumber>(); 
//		List<? super RationalNumber> containerTwo = new ArrayList<Number>(); 
//		List<? super RationalNumber> containerThree = new ArrayList<Object>(); 
//
//		RationalNumber itemValue = new RationalNumber(22, 7); 

//		containerOne.add(itemValue); 
//		containerTwo.add(itemValue); 
//		containerThree.add(itemValue);
		A a1=new A();
		B b1=new B();
		C c1=new C();
		D d1=new D();
		Number n;
		
		List<A> list=new ArrayList<A>();
		list.add(a1);
		
		/**
		 *         ? super Class-Name
		 */
		List<? super A> listA=new ArrayList<>();
		listA.add(b1);
		listA.add(c1);
		listA.add(a1);
		List<? super B> listB=new ArrayList<>();
		listB.add(b1);
		listB.add(c1);
		//listB.add(a1);
		List<? super C> listC=new ArrayList<>();
		//listC.add(b1);
		listC.add(c1);
		//listC.add(a1);
		
		
		
		ArrayList<? extends C> listeC=new ArrayList<>();
//		listeC.add(c1);
//		listeC.add(a1);
//		listeC.add(b1);
		
		ArrayList<? extends C> listeB=new ArrayList<>();
//		listeB.add(c1);
//		listeB.add(a1);
//		listeB.add(b1);
		
		
		ArrayList<? extends C> listeA=new ArrayList<>();
//		listeA.add(c1);
//		listeA.add(a1);
//		listeA.add(b1);
		
		ArrayList<? extends D> listeD=new ArrayList<>();
//		listeD.add(c1);
//		listeD.add(a1);
//		listeD.add(b1);
//		listeD.add(d1);
		
	}

}
