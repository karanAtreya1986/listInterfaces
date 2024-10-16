package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PollMethodArrayListStack {

	// The method poll() is undefined for the type Stack<String>
	// poll method not for array list.
	// gives compile time error.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.push("a");
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");

		// gives the first element from link list.
		// removes the first element also.
//		String s1 = linkList.poll();
//		System.out.println(s1);
//		System.out.println(linkList);

	}

}
