package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class SizeOfStack {

	// same for link list and array list and vector list and stack.
	
	public static void main(String[] args) {

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

		// returns integer number denoting the size
		int i1 = obj1.size();
		// output will be 6
		System.out.println(i1);
	}

}
