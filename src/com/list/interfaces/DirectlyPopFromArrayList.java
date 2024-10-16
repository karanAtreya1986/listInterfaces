package com.list.interfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;

public class DirectlyPopFromArrayList {

	// pop not for array list.
	// compile time error.

	public static void main(String[] args) {

		ArrayList<Integer> s1 = new ArrayList<>();

//		s1.push(10);
//		s1.push(10);
//		s1.push(0);
//		s1.push(0);
//
//		s1.push(4324);
//
//		s1.push(13242340);
//
//		s1.push(435435);

		System.out.println("--------------------------");

		System.out.println(s1);

		System.out.println("--------------------------");

		// you can directly use pop
		// use stackname.pop
		// returns the element removed
//		Integer p1 = s1.pop();
//		System.out.println(p1);
//		Integer p2 = s1.pop();
//		System.out.println(p2);
//		Integer p3 = s1.pop();
//		System.out.println(p3);

		System.out.println(s1);
	}

}
