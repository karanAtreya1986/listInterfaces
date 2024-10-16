package com.list.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class IteratorLinkList {

	// works for arraylist, linklist, vector and stacks.

	public static void main(String[] args) {

		LinkedList<String> v1 = new LinkedList<>();
		v1.add("tiger");
		v1.add("tiger");
		v1.add(null);
		v1.add(null);
		v1.add("lion");
		v1.add("cheetah");
		v1.add("rabbit");
		v1.add("laran");

		// even normal iterator works for printing link list
		Iterator<String> s1 = v1.iterator();
		while (s1.hasNext()) {
			String s2 = s1.next();
			System.out.println(s2);
		}
	}

}
