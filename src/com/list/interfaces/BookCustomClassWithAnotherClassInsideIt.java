package com.list.interfaces;

public class BookCustomClassWithAnotherClassInsideIt {

	int id;
	String name, author, publisher;
	int quantity;
	PriceCustomClass p1; // this is how we create object of another class and call in current class

	public BookCustomClassWithAnotherClassInsideIt(int id, String name, String author, String publisher, int quantity,
			PriceCustomClass p1) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.p1 = p1;
	}

}
