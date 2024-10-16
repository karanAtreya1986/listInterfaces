package com.list.interfaces;

import java.util.ArrayList;
import java.util.Stack;

public class AddStackToArrayListExampleTwo {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("tiger");
		s1.push(null);
		s1.push(null);
		s1.push("lion");
		s1.push("gold");

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		ArrayList<String> a1 = new ArrayList<>(s1);
		a1.add("tiger");
		a1.add(null);
		a1.add("monkey");
		a1.add("rabbit");

		System.out.println("stack list is ----------> " + s1);

		System.out.println("array list is ------> " + a1);

	}

}
