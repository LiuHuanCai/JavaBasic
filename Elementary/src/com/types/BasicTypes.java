package com.types;

/**
 * ��������˵��Java ������������
 * @author win8
 *
 */
public class BasicTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * ������������
		 */
		//1 bytes 8 bits
		boolean a = true;
		//1 bytes
		byte b = 1;
		//2 bytes
		short c = 2;
		//4 bytes
		int d = 3;
		// 8 bytes
		long e = 4l;
		//2 bytes
		char f = 5;
		//4 bytes
		float g = 6.0f;
		//8 bytes
		double h = 7.00d;
		
		//�߾���ֵ��ֵ���;����������ͣ�����ǿ������ת������֮������ǿ�ơ�
		int i = f;
		short k = (short) f;
		char j = (char) d;
		
		/**
		 * ת���ַ�
		 */
		char c1 = '\''; //������
		char c2 = '\\'; //��б��
		char c3 = '\"'; //˫����
		char c4 = '\n'; //���з�
		char c5 = '\t'; //��ֱ�Ʊ��
		char c6 = '\r'; //�س���
		System.out.print(c1);
		System.out.print(c5);
		System.out.print(c2);
		System.out.print(c6);
		System.out.print(c4);
		System.out.print(c3);
		
	}

}
