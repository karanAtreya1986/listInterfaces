package com.list.interfaces;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class AddStackToVectorsExampleTwo {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("tiger");
		s1.push(null);
		s1.push(null);
		s1.push("lion");
		s1.push("gold");

		Vector<String> a1 = new Vector<>();
		a1.add("tiger");
		a1.add(null);
		a1.add("monkey");
		a1.add("rabbit");

		// returns true or false depending on addition success
		// right list added to left list
		// first elements from left list displayed, then elements from right list
		// displayed
		boolean b1 = a1.addAll(s1);
		System.out.println(b1);

		System.out.println("stack is " + s1);
		System.out.println("vector is " + a1);
	}

}
