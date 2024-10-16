package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class UsingEnhancedForLoopForStack {

	public static void main(String[] args) {

		// same for link list and array list and vectors and stack.

		Stack<String> obj = new Stack<>();

		obj.push("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.push("A");
		obj.add(null);

		Stack<String> obj1 = new Stack<>();

		obj1.add("Awerewr");
		obj1.push("324324B");
		obj1.add("C#$#@$@$");
		obj1.add("Cwerwerwer");
		obj1.push("A2423423");
		obj1.add(null);

		boolean b1 = obj.addAll(obj1);

		// enhanced for loop can be used to iterate list
		for (String s1 : obj) {
			System.out.println(s1 + " ");
		}

		// enhanced for loop can be used to iterate list
		for (String s2 : obj1) {
			System.out.println(s2 + " ");
		}
//Iterator faster than enhanced for loop.
		// Manipulation is slow in array list. Remove any element and entire array bits
		// have to be rearranged.
		// Link list is faster than array list in CRUD. Link list uses doubly link list.
		// No bit shifting required.
		// Search is faster in arrayList than any other list. We use get() method. We
		// give index and then going to index and getting value is faster. Array list
		// better for storing and accessing data.

	}

}
