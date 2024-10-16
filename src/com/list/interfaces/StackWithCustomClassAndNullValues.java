package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackWithCustomClassAndNullValues {

	// Array list-
	// Removal or changing some element in between is time consuming in array list
	// because entire array list to be rearranged.

	public static void main(String[] args) {

		// same working for all list interfaces

		// we can have generics of custom class also in collections
		Stack<BookClass> obj = new Stack<>();

		// duplicates allowed as list
		BookClass b1 = new BookClass(1, "karan", null, "public1", 0);
		BookClass b2 = new BookClass(1, "karan", null, "public1", 0);
		BookClass b3 = new BookClass(2, "rocky", "balboa", "public2", 200);
		BookClass b4 = new BookClass(3, "tiger", "sahab", "public3", 300);
		BookClass b5 = new BookClass(4, "singh", "manchor", "public4", 400);

		obj.push(b1);
		obj.push(b2);
		obj.push(b3);
		obj.push(b4);
		obj.push(b5);
		obj.push(null);

		// since we added null object, so when we try to print out we get null pointer
		// exception
//		for (BookClass bookClass : obj) {
//			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
//					+ " " + bookClass.quantity);
//		}

		// how to handle null
		// use if statements
		// we will still get same results as above
		// because we have written if above the for loop and only when printing does the
		// program know there is a null value
//		if (obj != null) {
//			for (BookClass bookClass : obj) {
//				System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " "
//						+ bookClass.publisher + " " + bookClass.quantity);
//			}
//		}

		// correct way to avoid the error
		// now when it goes inside the stack
		// it will check if the stack object is null
		// if it is null then dont print, else keep printing
		for (BookClass bookClass : obj) {
			if (bookClass != null) {
				System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " "
						+ bookClass.publisher + " " + bookClass.quantity);
			}

		}

	}

}
