package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddLinkListToArrayListExampleTwo {

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("b");
		linkList.add("e");

		ArrayList<String> arrayList = new ArrayList<>();
		linkList.add("a1");
		linkList.add(null);
		linkList.add("b1");
		linkList.add("b");
		linkList.add("b");
		linkList.add("b");
		linkList.add("b");
		linkList.add("c1");
		linkList.add("d1");
		linkList.add("b1");
		linkList.add("e1");

		// use add all method
		// pass in other collection
		// returns boolean indicating if added successfully or not
		boolean b1 = arrayList.addAll(linkList);
		System.out.println(b1);

		System.out.println("--------------------");

		// print array list
		for (String s1 : arrayList) {
			System.out.println(s1);
		}

		System.out.println("--------------------");

		for (String s2 : linkList) {
			System.out.println(s2);
		}

	}

	// both array list and link list are updated with all values
	// not sure if it should work that way
}
