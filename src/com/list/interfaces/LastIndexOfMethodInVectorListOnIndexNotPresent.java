package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LastIndexOfMethodInVectorListOnIndexNotPresent {
	
	// works on all list interfaces.

	public static void main(String[] args) {

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
		// we pass an element which is not present only
		int i1 = linkList.lastIndexOf("disco");
		// returns -1 as the element is not present
		System.out.println(i1);

	}

}
