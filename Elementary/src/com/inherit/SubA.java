package com.inherit;

public class SubA extends AbstractA {

	@Override
	void method() {
		System.out.println("Sub");
	}

	public static void main(String[] args) {
		new SubA().test();
	}

}
