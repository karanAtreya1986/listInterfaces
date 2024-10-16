package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CustomClassWithArrayListAndNullExampleTwo {

	public static void main(String[] args) {

		// same way for all list interfaces

		List<BookClass> obj = new ArrayList<>();

		BookClass b1 = new BookClass(1, "karan", null, "public1", 100);
		BookClass b2 = new BookClass(1, "karan", null, "public1", 100);
		BookClass b3 = new BookClass(2, "rocky", "balboa", "public2", 200);
		BookClass b4 = new BookClass(3, "tiger", "sahab", "public3", 300);
		BookClass b5 = new BookClass(4, "singh", "manchor", "public4", 400);

		// first value is printed. second value is assigned null. so when we try to
		// print it throws null pointer exception. all values below it also stopped as
		// java stops program when there is an error.
		b2 = null;
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		obj.add(null);

		for (BookClass bookClass : obj) {
			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
					+ " " + bookClass.quantity);
		}

	}

}
