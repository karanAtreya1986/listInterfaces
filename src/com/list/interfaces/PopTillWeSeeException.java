package com.list.interfaces;

import java.util.Stack;

public class PopTillWeSeeException {

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

		// you can directly use pop
		// use stackname.pop
		// returns the element removed
		// keep removing till we get empty stack exception
		Integer p1 = s1.pop();
		System.out.println(p1);
		Integer p2 = s1.pop();
		System.out.println(p2);
		Integer p3 = s1.pop();
		System.out.println(p3);
		Integer p4 = s1.pop();
		System.out.println(p4);
		Integer p5 = s1.pop();
		System.out.println(p5);
		Integer p6 = s1.pop();
		System.out.println(p6);
		Integer p7 = s1.pop();
		System.out.println(p7);
		Integer p8 = s1.pop();
		System.out.println(p8);
		Integer p9 = s1.pop();
		System.out.println(p9);
		Integer p10 = s1.pop();
		System.out.println(p10);

		System.out.println(s1);
	}

}
