package com.types;

/**
 * ��������˵�������еĲ�������
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
		// �������ݲ���ʱ �������ǻ����������ͣ��򴫵ݵ��ǲ���ֵ
		// �����Ƕ�������飬�򴫵ݵ�������
		changeParameter(param1,param2,param3,param4);
		
		System.out.println("param1="+param1);
		System.out.println("param2.memberVariable="+param2.memberVariable);
		System.out.println("param3.memberVariable="+param3.memberVariable); 
		System.out.println("param4[0]="+param4[0]);

	}
	public static void changeParameter(int param1, ParamTester param2, ParamTester param3, int [] param4) {
		param1=1;
		param2.memberVariable=1;
		
		param3 = new ParamTester(); //�ı�changeParamter������ param3 ���õĶ��󣬲���ı�main������param3���õĶ���
		param3.memberVariable=1; 
		param4[0] = 1;
	}

}
