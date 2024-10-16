package com.list.interfaces;

import java.util.Stack;
import java.util.Vector;

public class IsEmptyMethodInVectorList {
	
	// works for all list interfaces.

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

		System.out.println(s1);

		System.out.println("--------------------------");

		// pop not for array list.
//		s1.pop();
//
//		s1.pop();
//
//		s1.pop();

		System.out.println(s1);

		// use stackname.isempty
		// returns true or false depending on whether stack is empty or not
		boolean b1 = s1.isEmpty();
		System.out.println(b1);
	}

}
