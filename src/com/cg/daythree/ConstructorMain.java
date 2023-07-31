package com.cg.daythree;

public class ConstructorMain {
	public static void main(String[] args) {
		int id = 42;
		String name = "bava";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();

	}

}

