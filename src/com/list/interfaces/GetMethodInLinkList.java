package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetMethodInLinkList {

	public static void main(String[] args) {

		// works for all list interfaces

		LinkedList<String> a1 = new LinkedList<>();
		a1.add("tiger");
		a1.add(null);

		LinkedList<String> a2 = new LinkedList<>();
		a2.add("lion");
		a2.add(null);

		// pass in the index from where to get the element
		// we get the element at the index
		String s1 = a1.get(1);
//		System.out.println(s1);

		// same tried on link list
		// pass in the index from where to get the element
		// we get the element at the index
//		String s2 = a2.get(1);
//		System.out.println(s2);

		// pass in index which is not present
		// we get index out of bounds exception
//		String s3 = a1.get(1234324);
//		System.out.println(s3);

		// same tried on link list
		// pass in index which is not present
		// we get index out of bounds exception
		String s4 = a2.get(23123);
		System.out.println(s4);
	}

}
