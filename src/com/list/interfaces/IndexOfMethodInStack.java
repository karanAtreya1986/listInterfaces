package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IndexOfMethodInStack {

	public static void main(String[] args) {

		// works for all list interfaces

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push(null);
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");
		linkList.push("e");

		// pass in the object as parameter to index of
		// it will return int which specifies the index

		// Searching is slow in linked list.

		int i1 = linkList.indexOf(null);
		System.out.println(i1);

	}

}
