package com.list.interfaces;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveFirstMethodStack {

	public static void main(String[] args) {

		// works for all list interfaces.

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.push("b");
		linkList.add("e");
		linkList.push("a");
		linkList.add("a");
		linkList.push("a");
		linkList.add("a");

		// no need to pass anything
		// removes the first element and returns it
		String s1 = linkList.removeFirst();
		System.out.println(s1);
	}

}
