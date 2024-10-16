package com.list.interfaces;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorWithArrayListAndLinkList {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();
		a1.add("test1");
		a1.add("test2");

		// prints in forward direction
//		ListIterator<String> lit2 = a1.listIterator();
//		while (lit2.hasNext()) {
//			System.out.println(lit2.next());
//		}

		// we have to give the location from where to start
		// here list iterator is at first index and elements before that there are no
		// elements, so we get blank output
//		ListIterator<String> lit2 = a1.listIterator();
//		while (lit2.hasPrevious()) {
//			System.out.println(lit2.previous());
//		}

		// give the index from where to start
		// here list iterator goes to end and moves back, so we get the values
		ListIterator<String> lit2 = a1.listIterator(a1.size());
		while (lit2.hasPrevious()) {
			System.out.println(lit2.previous());
		}
	}

}
