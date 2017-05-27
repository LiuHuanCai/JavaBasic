package com.types;

/**
 * 本类用于说明变量相关知识：实例变量，静态变量，变量作用域 
 * @author win8
 *
 */
public class Variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 静态变量位于方法区，在内存中只有一个，所有实例引用的是同一个静态变量
		// 实例变量则位于堆区，每个实例对象都有各自的实例变量
		Variable counterA = new Variable();
		Variable counterB = new Variable();
		counterA.count1++;
		System.out.println("CounterA count1="+counterA.count1);
		counterA.count2++;
		System.out.println("CounterA count2="+counterA.count2);
		counterB.count1++;
		System.out.println("CounterB count1="+counterB.count1);
		counterB.count2++;
		System.out.println("CounterB count2="+counterB.count2);
		
		Variable.count2++;
		System.out.println("CounterB count2="+counterB.count2);
	}
	
	/**
	 * 静态变量,static
	 */
	public int count1=0;
	public static int count2=0;
	/**
	 * 变量作用域
	 */
	int var1 = 0; //成员变量
	public void method1(int var2 /**方法参数 */) {
		int var3 = 0; //局部变量
		if(var3==0){
			int var4=0; //方法内部声明变量
			var1++;
			var2++;
			var3++;
			var4++;
		}
		var1++;
		var2++;
		var3++;
//		var4++; //编译出错，var4 只能在if{}代码块中引用
	}
	
	public void method2(){
		var1++;
//		var2++; //编译出错，var2 只能在method1()方法中引用
//		var3++; //编译出错, var3只能在method1()方法中引用
//		var4++; //编译出错, var4只能在method1()方法中的if{}代码块中被引用；
	}
	/** --------------------------------------------------------------------------------------*/
}
