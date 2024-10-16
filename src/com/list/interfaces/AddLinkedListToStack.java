package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AddLinkedListToStack {

	public static void main(String[] args) {

		LinkedList<String> a1 = new LinkedList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		Stack<String> s1 = new Stack<>();

		s1.push("tiger");
		s1.push("hello");
		s1.push(null);
		s1.push("world");
		s1.push("python");
		s1.push("zebra");

		// returns true or false depending on addition results
		// adds right hand side list to left hand side list
		// first left list elements printed, then right list elements printed
		boolean b1 = s1.addAll(a1);
		System.out.println(b1);

		System.out.println("array list " + a1);
		System.out.println("stack  " + s1);

	}

}
