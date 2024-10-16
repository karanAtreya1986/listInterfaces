package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddLinkListToArrayList {

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");
		linkList.add("a");

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("a12234");
		arrayList.add("a234324");
		arrayList.add("@#$#@4a");
		arrayList.add("@#$@#42a");

		// returns true if added successfully else false
		// add all contents of right hand side into left hand side
		boolean b1 = arrayList.addAll(linkList);
		System.out.println(b1);
		System.out.println(linkList);
		System.out.println(arrayList);
	}

}
