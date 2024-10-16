package com.list.interfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class EnumerationForStack {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();
		s1.push(10);
		s1.push(10);
		s1.push(0);
		s1.push(0);
		s1.push(20);
		s1.push(56);

		// enumeration can be used with stack interface also.
		Enumeration<Integer> e1 = s1.elements();
		while (e1.hasMoreElements()) {
			Integer i1 = e1.nextElement();
			System.out.println(i1);
		}
	}

}
