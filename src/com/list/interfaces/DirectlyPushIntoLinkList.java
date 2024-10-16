package com.list.interfaces;

import java.util.LinkedList;
import java.util.Stack;

public class DirectlyPushIntoLinkList {

	// cannot use push on link list.
	// compile time error.
	// Type mismatch: cannot convert from void to Integer

	public static void main(String[] args) {

		LinkedList<Integer> s1 = new LinkedList<>();

		// you can directly use push and push the value
//		Integer i1 = s1.push(10);
//		System.out.println(i1);
//		Integer i2 = s1.push(10);
//		System.out.println(i2);
//		Integer i3 = s1.push(0);
//		System.out.println(i3);
//		Integer i4 = s1.push(0);
//		System.out.println(i4);
//		Integer i5 = s1.push(4324);
//		System.out.println(i5);
//		Integer i6 = s1.push(13242340);
//		System.out.println(i6);
//		Integer i7 = s1.push(435435);
//		System.out.println(i7);

		System.out.println("--------------------------");

		// print the stack directly, it wont print memory address
		System.out.println(s1);
	}

}
