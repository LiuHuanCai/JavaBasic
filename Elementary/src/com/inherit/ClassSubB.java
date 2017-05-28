package com.inherit;

public class ClassSubB extends ClassB {

	void method() {
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {
		new ClassB().test();
		new ClassSubB().test();
	}

}
