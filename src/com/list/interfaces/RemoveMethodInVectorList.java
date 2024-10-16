package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class RemoveMethodInVectorList {

	// works in all list interfaces.

	public static void main(String[] args) {

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.addElement("b");
		linkList.add("e");
		linkList.add("a");
		linkList.addElement("a");
		linkList.add("a");
		linkList.add("a");

		// give the index number and you get the element in that location which will be
		// removed
//		String s1 = linkList.remove(5);
//		System.out.println(s1);

		// give index which does not exist
		// we get index out of bounds exception in output
//		String s1 = linkList.remove(30);
//		System.out.println(s1);

		// returns true or false if the element exist
		// we pass in the object
		boolean b1 = linkList.remove("b");
		System.out.println(b1);

		// pass in object which is not present in list
		// this will return false
		boolean b2 = linkList.remove("brwerwerewr");
		System.out.println(b2);
	}

}
