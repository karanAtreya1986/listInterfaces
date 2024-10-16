package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// Exact same working as array list. Just need a line replace where we change
		// arraylist to link list in line List<String> linkList = new LinkedList<>();

		// Traverse in both directions.
		// Manipulation of data is faster in link list than array list.
		// non synchronized
		// faster because there is no shifting of elements.
		// Get and set methods faster in array list than link list, because array list
		// is index-based data structure.

		List<String> linkList = new LinkedList<>();
		// duplicate values allowed.
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");

		// multiple null values allowed.
		linkList.add(null);
		linkList.add(null);
		linkList.add(null);
		linkList.add(null);

		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");

		// traverse using iterator
//		Iterator<String> it1 = linkList.iterator();
//		while (it1.hasNext()) {
//			String st1 = it1.next();
//			System.out.println(st1 + " ");
//		}

		// using for each loop to iterate
		for (String st1 : linkList) {
			System.out.println(st1 + " ");

		}
	}

	// All methods specific to link list will only be displayed when we write it
	// like this:
	// linkList<String> a = new linkList<>();
	// If we write like these then specific methods of link list will not be seen:
	// List<String> a = new linkList<>();

}
