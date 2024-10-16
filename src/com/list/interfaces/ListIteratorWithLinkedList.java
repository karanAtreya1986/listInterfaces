package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorWithLinkedList {

	// List iterator can move in forward and backward direction.
	// List iterator works with all classes which implement list interface.

	public static void main(String[] args) {

		// same list iterator can be used for linked list
		// and everything else is same
		// just change the name of the collection in line 18
		List<String> a1 = new LinkedList<>();
		a1.add("test1");
		a1.add("test2");

		// traverse in forward direction
		ListIterator<String> lit1 = a1.listIterator();
		while (lit1.hasNext()) {
			String s1 = lit1.next();
			System.out.println(s1);
		}

		// traverse in reverse direction
		// to traverse backwards, the iterator needs to be positioned at the end of the
		// list.
		// there is another list iterator method which accepts int as argument
//		ListIterator<String> lit2 = a1.listIterator(a1.size());
//		while (lit2.hasPrevious()) {
//			String s2 = lit2.previous();
//			System.out.println(s2);
//		}

		// what will happen if we use reverse direction without being at the end of the
		// list
		// we are at start of the list
		// before this the list is empty
		// so output will be blank
//		ListIterator<String> lit2 = a1.listIterator();
//		while (lit2.hasPrevious()) {
//			String s2 = lit2.previous();
//			System.out.println(s2);
//		}
	}

}
