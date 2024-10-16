package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackWithCustomClassGenerics {

	public static void main(String[] args) {

		// we can have generics of custom class also in collections
		// same working for all list interfaces

		// First create custom class and then pass it as <generics> in the collection
		// class name, else you get “Cannot be resolved” error at compile time since the
		// class is not present. same goes for link list as well.
		Stack<BookClass> obj = new Stack<>();

		// duplicates allowed as list
		BookClass b1 = new BookClass(1, "karan", null, "public1", 0);
		BookClass b2 = new BookClass(1, "karan", null, "public1", 0);
		BookClass b3 = new BookClass(2, "rocky", "balboa", "public2", 200);
		BookClass b4 = new BookClass(3, "tiger", "sahab", "public3", 300);
		BookClass b5 = new BookClass(4, "singh", "manchor", "public4", 400);

		// generics inside collection can be custom class also
		obj.push(b1);
		obj.push(b2);
		obj.push(b3);
		obj.push(b4);
		obj.push(b5);

		// we can use for each loop or iterator to print

		// since now we are dealing with objects, we cant just use the object name
		// it will give us the memory address
//		for (BookClass bookClass : obj) {
//			System.out.println(bookClass);
//		}

		// since we have to print object values, this is the way we have to use
		for (BookClass bookClass : obj) {
			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
					+ " " + bookClass.quantity);
			;
		}
	}

}
