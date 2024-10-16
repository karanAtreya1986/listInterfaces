package com.list.interfaces;

import java.util.Stack;

public class StacksExample {

	// LIFO.
	// Methods:
	// Push() – to add objects to top of stack.
	// Pop() – to remove objects from top of stack.
	// Try removing element which does not exist, we get EMPTY STACK EXCEPTION.

	public static void main(String[] args) {

		// duplicate values allowed

		Stack<Integer> s1 = new Stack<>();

		// pushing into stack
		// mention the stack name and the value to be pushed
		showpush(s1, 124);
		showpush(s1, 124);
		showpush(s1, 0);
		showpush(s1, 0);
		showpush(s1, 3345345);
		showpush(s1, 435345435);

		System.out.println("------------------------");

		// popping out the element
		// just give the stack name
		// it will remove out the last element
		showpop(s1);
		showpop(s1);
	}

	static void showpush(Stack<Integer> st, int a) {
		st.push(a);
		System.out.println("pushed element " + a);
		System.out.println("stack status is " + st);
	}

	static void showpop(Stack<Integer> st) {
		Integer i1 = st.pop();
		System.out.println("popped element " + i1);
		System.out.println("stack status is " + st);
	}

//	Stack-
//	Sub class of vector.
//	EmptyStackException – trying to get values from empty stack.
//	Peek() -> this will return top object but not remove it.
	// push will need object to be passed as argument like Integer, String etc

}
