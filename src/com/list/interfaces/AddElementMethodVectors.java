package com.list.interfaces;

import java.util.Vector;

public class AddElementMethodVectors {
	
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.addElement("tiger");
		v1.addElement("tiger");
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("lion");
		v1.addElement("goat");
		
		System.out.println(v1);
	}

}
