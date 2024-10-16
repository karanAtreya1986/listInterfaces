package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListWithCustomClass {

	public static void main(String[] args) {

		List<BookClass> obj = new LinkedList<>();

		// Integer can be zero.

		BookClass b1 = new BookClass(1, "karan", null, "public1", 100);
		BookClass b2 = new BookClass(1, "karan", null, "public1", 100);
		BookClass b3 = new BookClass(2, "rocky", "balboa", "public2", 200);
		BookClass b4 = new BookClass(3, "tiger", "sahab", "public3", 300);
		BookClass b5 = new BookClass(4, "singh", "manchor", "public4", 400);

		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);

		// since we have to print object values, this is the way we have to use
		for (BookClass bookClass : obj) {
			System.out.println(bookClass.author + " " + bookClass.id + " " + bookClass.name + " " + bookClass.publisher
					+ " " + bookClass.quantity);
			;
		}
	}

}
