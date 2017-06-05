package com.decorate;

public class Access {
	
	/**公开级别,同类，同包，子类，不同包都可以访问*/
	public String a ="public";
	/**受保护级别，同类，同包，子类可以访问*/
	protected String b = "protected";
	/**默认访问级别，同类，同包可以访问*/
	String c = "default";
	/**私有级别，只有同类中可以访问*/
	private String d = "private";
	
	public void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
