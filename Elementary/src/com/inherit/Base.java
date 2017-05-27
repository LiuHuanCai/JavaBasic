package com.inherit;

import java.io.IOException;

/**
 * 用于说明Java类的继承
 * @author win8
 *
 */
/* 1：Java 不支持多继承，一个类只能有一个直接父类，但可以有多个间接父类
 * 2：所有Java 类在没有extends 声明父类时，默认父类为Object类
 */
public class Base {
	public int base_publicVar =1;  //public 访问级别
	private int base_privateVar =2; //private 访问级别
	int base_defaultVar=3; //默认访问级别 ,包访问权限 friendly
	
	protected void base_method(){
		System.out.println("method of base");
		System.out.println("base_publicVar= "+base_publicVar);
		System.out.println("base_privateVar= "+base_privateVar);
		System.out.println("base_defaultVar= "+base_defaultVar);
	}

	public void override() throws IOException,NullPointerException {
		System.out.println("override method of base");
	}
	public void test_override()throws Exception{
		override();
	}
}
