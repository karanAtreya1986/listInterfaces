package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class UsingEnhancedForLoopForVectorList {

	public static void main(String[] args) {

		// same for link list and array list and vectors and stack.

		Vector<String> obj = new Vector<>();

		obj.addElement("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.addElement("A");
		obj.add(null);

		Vector<String> obj1 = new Vector<>();

		obj1.add("Awerewr");
		obj1.add("324324B");
		obj1.addElement("C#$#@$@$");
		obj1.add("Cwerwerwer");
		obj1.addElement("A2423423");
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
