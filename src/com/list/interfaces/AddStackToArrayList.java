package com.list.interfaces;

import java.util.ArrayList;
import java.util.Stack;

public class AddStackToArrayList {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("tiger");
		s1.push(null);
		s1.push(null);
		s1.push("lion");
		s1.push("gold");

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add(null);
		a1.add("monkey");
		a1.add("rabbit");

		// returns true or false depending on addition success
		// adds s1 into a1
		boolean b1 = a1.addAll(s1);
		System.out.println(b1);

		System.out.println("------------------");

		System.out.println("stack list is ----------> " + s1);

		System.out.println("------------------");

		System.out.println("array list is ------> " + a1);

	}

}
