package com.list.interfaces;

import java.util.Stack;

public class AddTwoStacksExampleTwo {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("tiger");
		s1.push(null);
		s1.push(null);
		s1.push("lion");
		s1.push("gold");

		// we cant add two stacks in this way.
		// it gives compile time error
//		Stack<String> s2 = new Stack<>(s1);

//		s2.push("tiger");
//		s2.push("monkey");
//		s2.push(null);
//		s2.push("kangaroo");
//		s2.push("boat");
//		s2.push("tbc");

//		System.out.println("stack 1 " + s1);
//		System.out.println("stack 2 " + s2);
	}

}
