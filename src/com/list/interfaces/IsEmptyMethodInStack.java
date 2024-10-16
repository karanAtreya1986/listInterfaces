package com.list.interfaces;

import java.util.Stack;

public class IsEmptyMethodInStack {
	
	// works for all list interfaces.

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

		System.out.println(s1);

		System.out.println("--------------------------");

		s1.pop();

		s1.pop();

		s1.pop();

		System.out.println(s1);

		// use stackname.isempty
		// returns true or false depending on whether stack is empty or not
		boolean b1 = s1.isEmpty();
		System.out.println(b1);
	}

}
