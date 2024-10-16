package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GetLastElementFromStack {

	public static void main(String[] args) {

		// getlast is applicable for all list interfaces

		Stack<String> arraylist = new Stack<>();
		arraylist.add("a");
		arraylist.push(null);
		arraylist.add("b");
		arraylist.push("c");
		arraylist.add("d");
		arraylist.push("e");

		// gets the last element
		// we can then print what it is
		String s1 = arraylist.getLast();
		System.out.println(s1);

	}

}
