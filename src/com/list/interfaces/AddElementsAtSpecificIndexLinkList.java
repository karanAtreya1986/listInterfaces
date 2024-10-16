package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddElementsAtSpecificIndexLinkList {

	public static void main(String[] args) {

		// applies to all list interfaces.

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		// you give the index and value to be added there
		linkList.add(2, "Salon");

		System.out.println(linkList);
	}

}
