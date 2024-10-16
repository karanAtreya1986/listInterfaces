package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AddLastMethodStack {

	public static void main(String[] args) {

		// works with all list interfaces.

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push(null);
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");
		linkList.push("e");

		// return type is void
		// adds this element to end of list
		linkList.addLast("Karan");

		for (String s1 : linkList) {
			System.out.println(s1);
		}
	}

}
