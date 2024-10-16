package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class AddLinkListToVectorList {

	public static void main(String[] args) {

		LinkedList<String> a1 = new LinkedList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		a1.add("cheetha");

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		Vector<String> v1 = new Vector<>(a1);
		v1.add("tiger");
		v1.add("stone");
		v1.add(null);
		v1.add("cold");
		v1.add("steve");
		v1.add("austin");

		System.out.println("link list " + a1);
		System.out.println("vector list " + v1);

	}

}
