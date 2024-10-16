package com.list.interfaces;

import java.util.Stack;

public class AddTwoStacks {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("tiger");
		s1.push(null);
		s1.push(null);
		s1.push("lion");
		s1.push("gold");

		Stack<String> s2 = new Stack<>();

		s2.push("tiger");
		s2.push("monkey");
		s2.push(null);
		s2.push("kangaroo");
		s2.push("boat");
		s2.push("tbc");

		// returns true or false depending on addition success
		// right side list added to left side list
		// when we print, elements from left list printed first, then elements from
		// right list
		boolean b1 = s1.addAll(s2);
		System.out.println(b1);

		System.out.println("stack 1 " + s1);
		System.out.println("stack 2 " + s2);
	}

}
