package com.list.interfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ReplaceMethodInListIteratorBackwardDirectionVectorList {

	// works for all list interfaces.

	public static void main(String[] args) {

		Vector<String> a1 = new Vector<>();
		a1.addElement("test1");
		a1.add("test2");

		ListIterator<String> lit1 = a1.listIterator(a1.size());

		while (lit1.hasPrevious()) {
//			lit1.set("tiger");
			String s1 = lit1.previous();
//			lit1.set("tiger");
			System.out.println(s1);
			// The set method of ListIterator replaces the last element returned by next()
			// or previous(). If you call set without first calling next() or previous(), it
			// will throw an IllegalStateException. However, in your case, since you are
			// calling next() just before set(), the issue may seem like the values are not
			// being replaced correctly in the output due to timing of operations.
			lit1.set("tiger");
			System.out.println(a1);

		}

	}

}
