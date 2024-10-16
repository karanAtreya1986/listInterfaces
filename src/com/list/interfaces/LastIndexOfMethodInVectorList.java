package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LastIndexOfMethodInVectorList {

	public static void main(String[] args) {
		
		// returns index of last occurrence of the element
		// works with all list interfaces

		Vector<String> linkList = new Vector<>();
		linkList.add("a");
		linkList.addElement(null);
		linkList.add("d");
		linkList.addElement("d");
		linkList.add("d");
		linkList.addElement("d");
		linkList.add("b");
		linkList.addElement("c");
		linkList.add("d");
		linkList.addElement("e");

		// pass in the object
		// pass the element and we get int which denotes the index
		int i1 = linkList.lastIndexOf("d");
		// returns 8 which is the last index of "d"
		System.out.println(i1);

	}

}
