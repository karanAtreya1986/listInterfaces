package com.list.interfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EnumerationForVectorList {

	public static void main(String[] args) {

		Vector<String> l1 = new Vector<>();

		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("godzilla");
		l1.add("lion");

		// enumeration works for vector list.
		Enumeration<String> e1 = l1.elements();
		while (e1.hasMoreElements()) {
			String s1 = e1.nextElement();
			System.out.println(s1);
		}
	}

}
