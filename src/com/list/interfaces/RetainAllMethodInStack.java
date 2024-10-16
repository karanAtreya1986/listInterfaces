package com.list.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RetainAllMethodInStack {

	public static void main(String[] args) {

		Stack<String> obj = new Stack<>();

		// works for all list interfaces.

		obj.push("A");
		obj.add("B");
		obj.add("C");
		obj.push("C");
		obj.add("A");
		obj.add(null);

		Stack<String> obj1 = new Stack<>();

		obj1.add("Aeewrewr");
		obj1.push("B32434");
		obj1.add("C#@$@#$34");
		obj1.add("@#$@#$C");
		obj1.push("A234234ererer");

		// retain all
		// accepts another collection as parameter
		// returns boolean if successful or not
		boolean b1 = obj.retainAll(obj1);
		System.out.println(b1);
		// removes everything from left side list and retains the right hand side list
		System.out.println(obj);
		// right hand side is retained
		System.out.println(obj1);

	}

}
