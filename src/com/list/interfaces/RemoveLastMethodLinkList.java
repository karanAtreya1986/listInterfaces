package com.list.interfaces;

import java.util.LinkedList;

public class RemoveLastMethodLinkList {

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
		linkList.add("aerer");

		// no need to pass anything
		// removes the last element from the list
		String s1 = linkList.removeLast();
		System.out.println(s1);
	}

}
