package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class AddArrayListToVectorList {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		// we get compile time error when adding two collections of different generics
//		Vector<Integer> v1 = new Vector<>(a1);
		Vector<String> v1 = new Vector<>(a1);
		v1.add("tiger");
		v1.add("stone");
		v1.add(null);
		v1.add("cold");
		v1.add("steve");
		v1.add("austin");

		// using normal iterator in vector
//		Iterator<String> it1 = v1.iterator();
//		while (it1.hasNext()) {
//			String s1 = it1.next();
//			System.out.println(s1);
//		}

		// list iterator in forward direction also works with vector
//		ListIterator<String> it1 = v1.listIterator();
//		while (it1.hasNext()) {
//			String s1 = it1.next();
//			System.out.println(s1);
//		}

		// list iterator in backward direction also works with vector
		// here we are at starting index so the previous element will be blank and
		// output will be blank
//		ListIterator<String> it1 = v1.listIterator();
//		while (it1.hasPrevious()) {
//			String s1 = it1.previous();
//			System.out.println(s1);
//		}

		// when you print in reverse direction, specify the index from where to start in
		// list iterator
		// now it prints in reverse direction
//		ListIterator<String> it1 = v1.listIterator(v1.size());
//		while (it1.hasPrevious()) {
//			String s1 = it1.previous();
//			System.out.println(s1);
//		}

		// normal for loop can also be used for traversing vector
		for (String string : v1) {
			System.out.println(string);
		}

	}

}
