package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicsOfListInterface {

	// Iterable, Collection, List, Set, Map, Queue are all interfaces.
	// Iterable gives us “iterator” which in turn helps traversing the collection in
	// forward direction.
	// ListIterator is also present for list interface in addition to normal
	// iterator which is available. This ListIterator can traverse both
	// directions.

	// Any API that extends iterable interface can be traversed using enhanced for
	// loop in addition to iterator.

	// List Interface-
	// Insertion order maintained. So, retrieval order will also be same.
	// Duplicates allowed.
	// Any number of null values allowed.

//	Set interface-
//	Unique elements.
//	Insertion order not mandatorily maintained.
//	Only one null value allowed.

//	Iterator-
//	Has three methods.
//	hasNext() – if there are more elements then true else false.
//	Next() – returns current element and moves cursor to next element.
//	Remove() – remove the last element returned by iterator.

	public static void main(String[] args) {

		// declare array list
		List<String> arraylist = new ArrayList<>();
		// duplicate values allowed.
		arraylist.add("a");
		arraylist.add("a");
		arraylist.add("a");
		arraylist.add("a");

		// multiple null values allowed.
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);

		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");

		// iterating through list using iterator
		Iterator<String> iteratorstring = arraylist.iterator();
		// hasnext will check if there are more elements
		while (iteratorstring.hasNext()) {
			// next will pick the current element and print it and move to the next record
			System.out.println(" " + iteratorstring.next());
		}

	}

}
