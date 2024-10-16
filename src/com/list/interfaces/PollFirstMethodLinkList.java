package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PollFirstMethodLinkList {

	// available in link list
	// not available for array list and other list classes

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");

		// removes the first element by default
		String s1 = linkList.pollFirst();
		// output will be the first element - a
		System.out.println(s1);
		// remainder of link list is printed
		System.out.println(linkList);

	}

}
