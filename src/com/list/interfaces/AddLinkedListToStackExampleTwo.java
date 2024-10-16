package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AddLinkedListToStackExampleTwo {

	public static void main(String[] args) {

		LinkedList<String> a1 = new LinkedList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		// we cant add two stacks in this way.
		// it gives compile time error
//		Stack<String> s1 = new Stack<>(a1);

//		s1.push("tiger");
//		s1.push("hello");
//		s1.push(null);
//		s1.push("world");
//		s1.push("python");
//		s1.push("zebra");
//
//		System.out.println("array list " + a1);
//		System.out.println("stack  " + s1);

	}

}
