package com.test;

import com.decorate.Access;
import com.decorate.PackageAccess;

public class TestAccess {
	
	public void show(Access access) {
		System.out.println(access.a);
		//System.out.println(access.b);
		//System.out.println(access.c);
	//	System.out.println(access.d);
	}

	public static void main (String [] args) {
		Access access = new Access();
		AccessImpl acl = new AccessImpl();
		access.show();
		new PackageAccess().access(access);
		acl.showAccess();
		new TestAccess().show(access);
	}
}
