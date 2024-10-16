package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PollFirstMethodArrayList {

	// poll first method not for array list.
	// gives compile time error.

	public static void main(String[] args) {

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");

		// removes the first element by default
//		String s1 = linkList.pollFirst();
		// output will be the first element - a
//		System.out.println(s1);
		// remainder of link list is printed
		System.out.println(linkList);

	}

}
