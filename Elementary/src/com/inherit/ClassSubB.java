package com.inherit;

public class ClassSubB extends ClassB {

	void method() {
		System.out.println("Sub");
	}
	
	public void methodA() {
		System.out.println("Sub MethodA");
	}
	public static void main(String[] args) {
		new ClassB().test();
		new ClassSubB().test();
	}

}
