package com.decorate;

public class Access {
	
	/**��������,ͬ�࣬ͬ�������࣬��ͬ�������Է���*/
	public String a ="public";
	/**�ܱ�������ͬ�࣬ͬ����������Է���*/
	protected String b = "protected";
	/**Ĭ�Ϸ��ʼ���ͬ�࣬ͬ�����Է���*/
	String c = "default";
	/**˽�м���ֻ��ͬ���п��Է���*/
	private String d = "private";
	
	public void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
