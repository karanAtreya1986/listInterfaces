package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PollFirstMethodVectorList {

	// poll first method not for vector list.
	// gives compile time error.

	public static void main(String[] args) {

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");

//		// removes the first element by default
//		String s1 = linkList.pollFirst();
//		// output will be the first element - a
//		System.out.println(s1);
//		// remainder of link list is printed
//		System.out.println(linkList);

	}

}
