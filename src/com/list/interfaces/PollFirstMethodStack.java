package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PollFirstMethodStack {

	// poll first method not for stack.
	// gives compile time error.

	public static void main(String[] args) {

		Stack<String> linkList = new Stack<>();
		linkList.push("a");
		linkList.add("b");
		linkList.push("c");
		linkList.add("d");

//		// removes the first element by default
//		String s1 = linkList.pollFirst();
//		// output will be the first element - a
//		System.out.println(s1);
//		// remainder of link list is printed
//		System.out.println(linkList);

	}

}
