package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ClearMethodInStacks {

	public static void main(String[] args) {

		// clear method works the same way for all list interfaces

		Stack<String> obj = new Stack<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		// clears the stack
		// return type is void.
		// output will be [].
		obj.clear();
		System.out.println(obj);

	}

}
