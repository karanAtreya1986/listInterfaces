package com.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import javax.naming.AuthenticationException;

public class PreviousIndexMethodInListIteratorStack {

	// works for all list interfaces.

	public static void main(String[] args) {

		Stack<String> a1 = new Stack<>();
		a1.push("test1");
		a1.add("test2");

		// when you are in first element, then you get no output as there is no previous
		// element.
//		ListIterator<String> lit1 = a1.listIterator();
//		while (lit1.hasPrevious()) {
//			int indexnumber = lit1.previousIndex();
//			System.out.println("index number is ------> " + indexnumber);
//			String s1 = lit1.previous();
//			System.out.println(s1);
//		}

		// print the index number after moving to next element
		// no output as there is no previous element and we are currently at first
		// element
//		while (lit1.hasPrevious()) {
//			int indexnumber = lit1.previousIndex();
//			System.out.println("index number is ------> " + indexnumber);
//			String s1 = lit1.previous();
//			System.out.println(s1);
//		}

		// there is another listiterator method
		// here the argument is integer
		// we specify from where to start
		// in this case we want to start from end
		// index will be printed in reverse as we are going from back to front

//		ListIterator<String> lit1 = a1.listIterator(a1.size());
//		while (lit1.hasPrevious()) {
//			int indexnumber = lit1.previousIndex();
//			System.out.println("index number is ------> " + indexnumber);
//			String s1 = lit1.previous();
//			System.out.println(s1);
//		}

		// here we first print the value from previous index
		// then it moves to previous
		// so index number is zero as we are going in reverse
		// then it prints the next element
		// then previous moves index to -1 and prints that
//		ListIterator<String> lit1 = a1.listIterator(a1.size());
//		while (lit1.hasPrevious()) {
//			String s1 = lit1.previous();
//			System.out.println(s1);
//			int indexnumber = lit1.previousIndex();
//			System.out.println("index number is ------> " + indexnumber);
//		}

		// see what happens when we jumble up next and previous
		// we check if next element is there and it is true
		// then we go back suddenly to previous index and print it
		// since we are at first element previous index is -1
		// then we try to move previous but there is no element as we are at first
		// location
		// so when we try to print element value, we get no such element exception
		ListIterator<String> lit1 = a1.listIterator();
		while (lit1.hasNext()) {
			int indexnumber = lit1.previousIndex();
			System.out.println("index number is ------> " + indexnumber);
			String s1 = lit1.previous();
			System.out.println(s1);

		}
	}

}
