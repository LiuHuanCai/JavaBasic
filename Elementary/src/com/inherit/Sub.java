package com.inherit;

import java.io.IOException;

public class Sub extends Base{
	
	String var = "Sub's variable"; //隐藏父类的var变量 
	
	/*访问权限*/
	public void sub_method() {
		System.out.println("method of sub");
		System.out.println(base_publicVar);
		System.out.println(base_defaultVar);
		//System.out.println(base_privateVar); // 非法，不能直接访问父类的private 类型变量
		base_method(); 
	}

	/*方法重载*/
	/*方法重载需要满足以下条件
	 * 1 方法名相同
	 * 2 方法的参数类型，个数，顺序至少有一项不同
	 * 3 方法返回类型可以不同
	 * 4 方法修饰符可以不同
	 */
	public void overLoad(){
		System.out.println("overload method with no param");
	}
	
	public int overLoad(int i){
		System.out.println("overload method with int param="+i);
		return 0;
	}
	public void overLoad(String str){
		System.out.println("overload method with string param="+str);
	}
	
	/*方法覆盖*/
	//1 子类方法名，参数，返回类型必须与父类方法一致
	//2 子类方法不能缩小父类方法访问权限，如父类为public,则子类不能为private
	//3 子类方法不能抛出比父类方法更多的异常
	//4 父类静态方法不能被子类覆盖为非静态，父类非静态不能被子类覆盖为静态
	//5 父类的私有方法不能被子类覆盖
	//6父类的抽象方法可以被子类通过两种途径覆盖：一是子类实现父类抽象方法，二是子类重新声明
	@Override
	public void override() throws IOException{
		
		System.out.println("override method of sub");
		//super.override(); //子类中可以通过super 关键字来访问被覆盖的父类方法
		
	}
	
	@Override
	void testSuper() {
		System.out.println("call Sub's method");
	}
	
	void test() {
		String var = "Loval variable";
		
		System.out.println("var is " + var);
		System.out.println("this.var is " + this.var);
		System.out.println("super.var is " + super.var);
		testSuper();
		this.testSuper();
		super.testSuper();
	}
	
	
	public static void main(String args [] ){
		Sub sub = new Sub();
		/*测试访问权限和继承属性*/
		sub.base_publicVar=4;
		//sub.base_privateVar=5; //非法，子类不能继承父类的private类型变量
		sub.base_defaultVar=6;
		sub.base_method(); //子类虽然不能直接访问父类private类型变量，但可以通过父类的public 类型方法访问
		sub.sub_method();
		
		/*测试方法重载*/
		sub.overLoad();
		sub.overLoad(5);
		sub.overLoad("hello");
		
		/*测试方法覆盖*/
		try {
			sub.override();
			sub.test_override();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sub.test();
	}
}
