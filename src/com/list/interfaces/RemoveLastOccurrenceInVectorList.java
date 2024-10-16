package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class RemoveLastOccurrenceInVectorList {

	public static void main(String[] args) {

		// remove last occurrence not for vector list.
		// compile time error.

		Vector<String> linkList = new Vector<>();
		linkList.addElement("a");
		linkList.add(null);
		linkList.add("b");
		linkList.add("c");
		linkList.addElement("d");
		linkList.add("b");
		linkList.add("e");
		linkList.add("a");
		linkList.addElement("a");
		linkList.add("a");
		linkList.add("a");

		// pass in the object to be removed
		// last occurrence of the element will be removed
		// if multiple occurrence of same object, only remove the first one
//		boolean b1 = linkList.removeLastOccurrence("a");
//		System.out.println(b1);
//
//		// print and check if all other elements present
//		for (String s1 : linkList) {
//			System.out.println(s1);
//		}

		// we pass in element which is not present in list
		// returns false in output
//		boolean b1 = linkList.removeLastOccurrence("aewrwer@$#@4234324");
//		System.out.println(b1);

		// print and check if all other elements present
		for (String s1 : linkList) {
			System.out.println(s1);
		}
	}
}
