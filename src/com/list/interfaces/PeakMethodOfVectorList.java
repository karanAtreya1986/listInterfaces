package com.list.interfaces;

import java.util.Stack;
import java.util.Vector;

public class PeakMethodOfVectorList {

	public static void main(String[] args) {

		Vector<Integer> s1 = new Vector<>();

		s1.addElement(10);
		s1.add(10);
		s1.addElement(0);
		s1.add(0);

		s1.addElement(4324);

		s1.add(13242340);

		s1.addElement(435435);

		System.out.println("--------------------------");

		// print the stack directly, it wont print memory address
		System.out.println(s1);

		System.out.println("--------------------------");

		// peek method not for vector list.
//		Integer i11 = s1.peek();
//		System.out.println(i11);
	}

}
