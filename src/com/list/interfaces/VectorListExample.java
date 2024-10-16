package com.list.interfaces;

import java.util.LinkedList;
import java.util.Vector;

public class VectorListExample {

	// Vector-
	// Synchronized. Due to this, searching, adding, deleting, updating performance
	// is poor.

	// Array list increases its size by 50% when capacity is full.
	// Vector increases by 100% when capacity is full.
	// Vector is slow because its synchronized

	public static void main(String[] args) {

		// In vector we give initial capacity and load factor. When the capacity is
		// full, how much more capacity to allocate, this is load factor.
		// load factor and capacity can be ignored and not mandatory to give when
		// creating Vectors.
		Vector<String> v1 = new Vector<>(10, 5);
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("lion");
		v1.addElement("cheetah");
		v1.addElement("rabbit");
		// even add method is present
		v1.add("laran");

		// size of vector
		// returns size in int - 8
		int i1 = v1.size();
		System.out.println(i1);

		// print capacity of vector

		// prints the current capacity value
		int c1 = v1.capacity();
		System.out.println(c1);
	}
}
