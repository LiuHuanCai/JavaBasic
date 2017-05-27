package com.types;

/**
 * 本类用于说明方法中的参数传递
 * @author win8
 *
 */
public class ParamTester {

	
	public int memberVariable=0;
	
	public static void main(String[] args) {
		int param1=0;
		ParamTester param2=new ParamTester();
		ParamTester param3=new ParamTester();
		int [] param4 = {0};
		// 方法传递参数时 ，参数是基本数据类型，则传递的是参数值
		// 参数是对象或数组，则传递的是引用
		changeParameter(param1,param2,param3,param4);
		
		System.out.println("param1="+param1);
		System.out.println("param2.memberVariable="+param2.memberVariable);
		System.out.println("param3.memberVariable="+param3.memberVariable); 
		System.out.println("param4[0]="+param4[0]);

	}
	public static void changeParameter(int param1, ParamTester param2, ParamTester param3, int [] param4) {
		param1=1;
		param2.memberVariable=1;
		
		param3 = new ParamTester(); //改变changeParamter方法中 param3 引用的对象，不会改变main方法中param3引用的对象
		param3.memberVariable=1; 
		param4[0] = 1;
	}

}
