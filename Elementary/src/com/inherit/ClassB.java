package com.inherit;

public class ClassB {

	void method() {
		System.out.println("Base");
	}
	void test() {
		method();
	}
	
	public ClassB() {
		methodA();
	}
	
	public void methodA(){}
}
