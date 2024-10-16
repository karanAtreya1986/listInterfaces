package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AddLastMethodVectorList {

	public static void main(String[] args) {

		// works with all list interfaces.

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");
		linkList.addElement("e");

		// return type is void
		// adds this element to end of list
		linkList.addLast("Karan");

		for (String s1 : linkList) {
			System.out.println(s1);
		}
	}

}
