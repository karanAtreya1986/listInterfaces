package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

//	Array list-
//	Uses dynamic array for storing elements. Size grows dynamically.
//	Array list is not synchronized, cannot be used in multi-threading program or environment.
//	Vector list is synchronized.
//	Memory consumption best in array list.
//	Disadvantage:
//	Bit wise data structure -> when we remove, edit or update then all the 
	// elements have to be rearranged by a bit.

	// Array list increases size by 50% when threshold limit is reached, i.e., when
	// array size is full then increase by 50% of the size. Example, if size is 10
	// and its full, then increase by 50% which is equal to 15.

	// adding two array list
	public static void main(String[] args) {

		List<String> obj = new ArrayList<>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("C");
		obj.add("A");
		obj.add(null);

		List<String> obj1 = new ArrayList<>();

		obj1.add("Awerewr");
		obj1.add("324324B");
		obj1.add("C#$#@$@$");
		obj1.add("Cwerwerwer");
		obj1.add("A2423423");
		obj1.add(null);

		// add all elements from obj1 array list to obj array list
		// returns true if successfully added else false
		boolean b1 = obj.addAll(obj1);
		System.out.println("result of addition returns boolean ------> " + b1);

		// iterate obj array list
		// order will be maintained as entered during printing
		Iterator<String> it1 = obj.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next() + " ");
		}

		// iterate obj1 array list
		// order will be maintained as entered during printing
		Iterator<String> i21 = obj1.iterator();
		while (i21.hasNext()) {
			System.out.println(i21.next() + " ");
		}

		// for each loop for iterating can also be used.
		// iterate over obj1 array list.
		for (String string : obj1) {
			System.out.println(string);
		}

		// for each loop for iterating can also be used.
		// iterate over obj array list.
		for (String string1 : obj) {
			System.out.println(string1);
		}
	}

	// we can traverse using for-each loop also
}
