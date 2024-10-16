package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddLinkListToArrayListExampleThree {

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add(null);
		linkList.add("a");
		linkList.add("b");

		// another way to add collections
		// pass as parameter
		// when we print, elements from right list first displayed then elements from
		// left list displayed
		ArrayList<String> arrayList = new ArrayList<>(linkList);
		arrayList.add(null);
		arrayList.add("a");
		arrayList.add("@#$#@4a");
		arrayList.add("@#$@#42a");

		System.out.println(linkList);
		System.out.println(arrayList);
	}

}
