package com.list.interfaces;

import java.util.Stack;

public class PeakMethodOfStack {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();

		s1.push(10);
		s1.push(10);
		s1.push(0);
		s1.push(0);

		s1.push(4324);

		s1.push(13242340);

		s1.push(435435);

		System.out.println("--------------------------");

		// print the stack directly, it wont print memory address
		System.out.println(s1);

		System.out.println("--------------------------");

		// peak method
		// returns the object or element at the top of the stack and then when we print
		// it, we can see the value
		Integer i11 = s1.peek();
		System.out.println(i11);
	}

}
