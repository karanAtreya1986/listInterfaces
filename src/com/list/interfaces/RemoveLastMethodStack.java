package com.list.interfaces;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveLastMethodStack {

	public static void main(String[] args) {

		// works for all list interfaces.

		Stack<String> linkList = new Stack<>();
		linkList.push("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.push("b");
		linkList.add("e");
		linkList.add("a");
		linkList.add("a");
		linkList.push("a");
		linkList.add("aerer");

		// no need to pass anything
		// removes the last element from the list
		String s1 = linkList.removeLast();
		System.out.println(s1);
	}

}
