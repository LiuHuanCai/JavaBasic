package com.inherit;

public class Son extends Parent {

	String var = "SonVar";
	static String staticVar = "StaticSonVar";
	
	void method() {
		System.out.println("Son method");
	}
	
	static void staticMethod() {
		System.out.println("Static Son method");
	}
	
	String subVar = "Var only belongs to Son";
	void subMethod() {
		System.out.println("Method only belongs to Son");
	}
	public static void main(String[] args) {
		Parent who = new Son();
		System.out.println("who.var=" + who.var);  //父类的var
		System.out.println("who.staticVar=" + who.staticVar); //父类的 staticvar
		who.method();  //调用子类成员方法
		who.staticMethod(); //调用父类static方法
		
//		who.subVar="123";  //编译出错，对于应用类型变量who，按照其声明的类型进行处理，无法访问子类的成员变量和方法
//		who.subMethod();
		
		System.out.println("who.subVar=" +((Son)who).subVar);  //访问子类的
		System.out.println("who.subVar=" +((Son)who).var); //子类的var
		System.out.println("who.subVar=" +((Son)who).staticVar); //子类的
		((Son)who).method();  //子类 
		((Son)who).staticMethod(); //子类
		((Son)who).subMethod(); //子类
		
	}

}
