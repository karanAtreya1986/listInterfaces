package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class NextIndexMethodInListIteratorStack {

	// works for all list interfaces.

	public static void main(String[] args) {

		Stack<String> a1 = new Stack<>();
		a1.push("test1");
		a1.add("test2");

		ListIterator<String> lit1 = a1.listIterator();
//		while (lit1.hasNext()) {
//			int indexnumber = lit1.nextIndex();
//			System.out.println("index number is ------> " + indexnumber);
//			String s1 = lit1.next();
//			System.out.println(s1);
//		}

		// print the index number after moving to next element
		// it will start from one not zero
		while (lit1.hasNext()) {
			String s1 = lit1.next();
			System.out.println(s1);
			int indexnumber1 = lit1.nextIndex();
			System.out.println("index number is ------> " + indexnumber1);
		}
	}

}
