package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddLastMethodArrayList {

	public static void main(String[] args) {

		// works with all list interfaces.

		ArrayList<String> linkList = new ArrayList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// return type is void
		// adds this element to end of list
		linkList.addLast("Karan");

		for (String s1 : linkList) {
			System.out.println(s1);
		}
	}

}
