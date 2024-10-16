package com.list.interfaces;

import java.util.LinkedList;

public class RemoveFirstMethodLinkList {

	public static void main(String[] args) {

		// works for all list interfaces.

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("b");
		linkList.add("e");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");

		// no need to pass anything
		// removes the first element and returns it
		String s1 = linkList.removeFirst();
		System.out.println(s1);
	}

}
