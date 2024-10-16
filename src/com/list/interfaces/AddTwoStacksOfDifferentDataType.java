package com.list.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class AddTwoStacksOfDifferentDataType {

	public static void main(String[] args) {

		Stack<String> obj = new Stack<>();

		obj.push("tiger");
		obj.push("tiger");
		obj.push(null);
		obj.push(null);
		obj.push("lion");
		obj.push("gold");

		Stack<Integer> obj1 = new Stack<>();

		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		obj1.push(4);
		obj1.push(5);
		obj1.push(6);

		// different data type collection cannot be added.
		// this applies to all list interfaces.
//		boolean b1 = obj.addAll(obj1);

		// enhanced for loop can be used to iterate list
//		for (String s1 : obj) {
//			System.out.println(s1 + " ");
//		}

		// enhanced for loop can be used to iterate list
//		for (String s2 : obj1) {
//			System.out.println(s2 + " ");
//		}

	}

}
