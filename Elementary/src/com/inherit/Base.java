package com.inherit;

import java.io.IOException;

/**
 * ����˵��Java��ļ̳�
 * @author win8
 *
 */
/* 1��Java ��֧�ֶ�̳У�һ����ֻ����һ��ֱ�Ӹ��࣬�������ж����Ӹ���
 * 2������Java ����û��extends ��������ʱ��Ĭ�ϸ���ΪObject��
 */
public class Base {
	public int base_publicVar =1;  //public ���ʼ���
	private int base_privateVar =2; //private ���ʼ���
	int base_defaultVar=3; //Ĭ�Ϸ��ʼ��� ,������Ȩ�� friendly
	
	protected void base_method(){
		System.out.println("method of base");
		System.out.println("base_publicVar= "+base_publicVar);
		System.out.println("base_privateVar= "+base_privateVar);
		System.out.println("base_defaultVar= "+base_defaultVar);
	}

	public void override() throws IOException,NullPointerException {
		System.out.println("override method of base");
	}
	public void test_override()throws Exception{
		override();
	}
}
