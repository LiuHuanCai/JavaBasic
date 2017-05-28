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
		System.out.println("who.var=" + who.var);  //�����var
		System.out.println("who.staticVar=" + who.staticVar); //����� staticvar
		who.method();  //���������Ա����
		who.staticMethod(); //���ø���static����
		
//		who.subVar="123";  //�����������Ӧ�����ͱ���who�����������������ͽ��д����޷���������ĳ�Ա�����ͷ���
//		who.subMethod();
		
		System.out.println("who.subVar=" +((Son)who).subVar);  //���������
		System.out.println("who.subVar=" +((Son)who).var); //�����var
		System.out.println("who.subVar=" +((Son)who).staticVar); //�����
		((Son)who).method();  //���� 
		((Son)who).staticMethod(); //����
		((Son)who).subMethod(); //����
		
	}

}
