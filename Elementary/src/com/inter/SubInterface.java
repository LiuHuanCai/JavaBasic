package com.inter;

//一个 interface 不能实现另一个interface ,但可以 继承多个接口 
public interface SubInterface extends BaseInterface1, BaseInterface2 {
	
public void sub();
}
