package com.types;

/**
 * ��������˵���������֪ʶ��ʵ����������̬���������������� 
 * @author win8
 *
 */
public class Variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��̬����λ�ڷ����������ڴ���ֻ��һ��������ʵ�����õ���ͬһ����̬����
		// ʵ��������λ�ڶ�����ÿ��ʵ�������и��Ե�ʵ������
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
	 * ��̬����,static
	 */
	public int count1=0;
	public static int count2=0;
	/**
	 * ����������
	 */
	int var1 = 0; //��Ա����
	public void method1(int var2 /**�������� */) {
		int var3 = 0; //�ֲ�����
		if(var3==0){
			int var4=0; //�����ڲ���������
			var1++;
			var2++;
			var3++;
			var4++;
		}
		var1++;
		var2++;
		var3++;
//		var4++; //�������var4 ֻ����if{}�����������
	}
	
	public void method2(){
		var1++;
//		var2++; //�������var2 ֻ����method1()����������
//		var3++; //�������, var3ֻ����method1()����������
//		var4++; //�������, var4ֻ����method1()�����е�if{}������б����ã�
	}
	/** --------------------------------------------------------------------------------------*/
}
