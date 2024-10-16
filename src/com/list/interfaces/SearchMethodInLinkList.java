package com.list.interfaces;

import java.util.LinkedList;
import java.util.Stack;

public class SearchMethodInLinkList {

	// search method not for link list.
	// compile time error.

	public static void main(String[] args) {

		LinkedList<Integer> s1 = new LinkedList<>();

		s1.push(10);

		s1.push(10);

		s1.push(0);

		s1.push(0);

		s1.push(4324);

		s1.push(13242340);

		s1.push(435435);

		System.out.println("--------------------------");

		// pass in element which is not present
		// output will be -1
		// returns index where the element is present
//		int a1 = s1.search("13242340");
//		System.out.println(a1);

		// search for elements which are present
//		int a1 = s1.search(4324);
//		// returns index location
//		System.out.println(a1);
//		int a2 = s1.search(13242340);
//		System.out.println(a2);

		// Index starts from 1 in stack search.
	}

}
