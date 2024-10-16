package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class AddElementMethodStack {

	// add element works for stacks.

	public static void main(String[] args) {

		Stack<String> v1 = new Stack<>();
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("lion");
		v1.addElement("goat");

		System.out.println(v1);
	}

}
