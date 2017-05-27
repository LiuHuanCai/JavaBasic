package com.inherit;

import java.io.IOException;

public class Sub extends Base{
	
	/*����Ȩ��*/
	public void sub_method() {
		System.out.println("method of sub");
		System.out.println(base_publicVar);
		System.out.println(base_defaultVar);
		//System.out.println(base_privateVar); // �Ƿ�������ֱ�ӷ��ʸ����private ���ͱ���
		base_method(); 
	}

	/*��������*/
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
	
	/*��������*/
	//1 ���෽�������������������ͱ����븸�෽��һ��
	//2 ���෽��������С���෽������Ȩ�ޣ��縸��Ϊpublic,�����಻��Ϊprivate
	//3 ���෽�������׳��ȸ��෽��������쳣
	//4 ���ྲ̬�������ܱ����า��Ϊ�Ǿ�̬������Ǿ�̬���ܱ����า��Ϊ��̬
	public void override() throws IOException{
		
		System.out.println("override method of sub");
		//super.override(); //�����п���ͨ��super �ؼ��������ʱ����ǵĸ��෽��
		
	}
	
	public static void main(String args [] ){
		Sub sub = new Sub();
		/*���Է���Ȩ�޺ͼ̳�����*/
		sub.base_publicVar=4;
		//sub.base_privateVar=5; //�Ƿ������಻�ܼ̳и����private���ͱ���
		sub.base_defaultVar=6;
		sub.base_method(); //������Ȼ����ֱ�ӷ��ʸ���private���ͱ�����������ͨ�������public ���ͷ�������
		sub.sub_method();
		
		/*���Է�������*/
		sub.overLoad();
		sub.overLoad(5);
		sub.overLoad("hello");
		
		/*���Է�������*/
		try {
			sub.override();
			sub.test_override();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
