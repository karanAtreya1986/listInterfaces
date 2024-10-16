package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackWithTwoCustomClasses {

	// same working for all list interfaces

	public static void main(String[] args) {

		Stack<BookCustomClassWithAnotherClassInsideIt> obj = new Stack<>();

		PriceCustomClass p11 = new PriceCustomClass(10, 20, 30);
		PriceCustomClass p22 = new PriceCustomClass(10, 20, 30);
		PriceCustomClass p33 = new PriceCustomClass(0, 0, 0);
		PriceCustomClass p44 = new PriceCustomClass(0, 0, 0);
		// this will give compile error as only int allowed
//		PriceCustomClass p5 = new PriceCustomClass(45.89, 56.780, 534534.6576570);
		// this will give compile error as some int has to be entered
//		PriceCustomClass p5 = new PriceCustomClass(,,);

		// duplicates allowed as list
		// even if any argument is missed in constructor call, then compile time error
		BookCustomClassWithAnotherClassInsideIt b1 = new BookCustomClassWithAnotherClassInsideIt(1, "karan", null,
				"public1", 0, p11);
		BookCustomClassWithAnotherClassInsideIt b2 = new BookCustomClassWithAnotherClassInsideIt(1, "karan", null,
				"public1", 0, p22);
		BookCustomClassWithAnotherClassInsideIt b3 = new BookCustomClassWithAnotherClassInsideIt(2, "rocky", "balboa",
				"public2", 200, p44);
		BookCustomClassWithAnotherClassInsideIt b4 = new BookCustomClassWithAnotherClassInsideIt(3, "tiger", "sahab",
				"public3", 300, p33);
		BookCustomClassWithAnotherClassInsideIt b5 = new BookCustomClassWithAnotherClassInsideIt(4, "singh", "manchor",
				"public4", 400, p33);

		// generics inside collection can be custom class also
		obj.add(b5);
		obj.push(b4);
		obj.add(b3);
		obj.push(b2);
		obj.add(b1);
//		obj.add// when we use add method for stack, return type becomes vector

		// since we have to print object values, this is the way we have to use
		// this will print memory address for the price class
//		for (BookCustomClassWithAnotherClassInsideIt bookClass : obj) {
//			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
//					+ " " + bookClass.quantity + " " + bookClass.p1.toString());
//			;
//		}

		// this is how we need to access all objects of one class in another classes'
		// for loop
		// now it will print the three prices in each row
		for (BookCustomClassWithAnotherClassInsideIt bookClass : obj) {
			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
					+ " " + bookClass.quantity + " " + bookClass.p1.dollar + " " + bookClass.p1.inr + " "
					+ bookClass.p1.pound);
			;
		}
	}

}
