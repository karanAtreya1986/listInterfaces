package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AddElementsAtSpecificIndexStack {

	public static void main(String[] args) {

		// applies to all list interfaces.

		Stack<String> linkList = new Stack<>();
		linkList.add("a");
		linkList.push("a");
		linkList.add("a");
		linkList.push("a");
		// you give the index and value to be added there
		linkList.add(2, "Salon");

		System.out.println(linkList);
	}

}
