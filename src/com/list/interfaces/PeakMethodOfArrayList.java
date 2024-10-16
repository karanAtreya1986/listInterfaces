package com.list.interfaces;

import java.util.ArrayList;
import java.util.Stack;

public class PeakMethodOfArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> s1 = new ArrayList<>();

		s1.add(10);
		s1.add(10);
		s1.add(0);
		s1.add(0);

		s1.add(4324);

		s1.add(13242340);

		s1.add(435435);

		System.out.println("--------------------------");

		// print the stack directly, it wont print memory address
		System.out.println(s1);

		System.out.println("--------------------------");

		// peek method not for array list
		// gives compile time error
//		Integer i11 = s1.peek();
//		System.out.println(i11);
	}

}
