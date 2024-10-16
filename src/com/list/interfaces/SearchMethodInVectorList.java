package com.list.interfaces;

import java.util.Stack;
import java.util.Vector;

public class SearchMethodInVectorList {

	// search method not for vector list.
	// compile time error.

	public static void main(String[] args) {

		Vector<Integer> s1 = new Vector<>();

		s1.addElement(10);

		s1.add(10);

		s1.addElement(0);

		s1.add(0);

		s1.add(4324);

		s1.add(13242340);

		s1.add(435435);

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
