package com.list.interfaces;

import java.util.Stack;
import java.util.Vector;

public class AddVectorToStackExampleTwo {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(2, 5);
		v1.add("tiger");
		v1.add("stone");
		v1.add(null);
		v1.add("cold");
		v1.add("steve");
		v1.add("austin");

		// we cant add two stacks in this way.
		// it gives compile time error
//		Stack<String> s1 = new Stack<>(v1);

//		s1.push("tiger");
//		s1.push("hello");
//		s1.push(null);
//		s1.push("world");
//		s1.push("python");
//		s1.push("zebra");
//
//		// returns true or false depending on addition results
//		// adds right hand side list to left hand side list
//		// first left list elements printed, then right list elements printed
//		boolean b1 = s1.addAll(v1);
//		System.out.println(b1);
//
//		System.out.println("vector list " + v1);
//		System.out.println("stack  " + s1);
	}

}
