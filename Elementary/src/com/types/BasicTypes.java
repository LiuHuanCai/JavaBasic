package com.types;

/**
 * 本类用于说明Java 基本数据类型
 * @author win8
 *
 */
public class BasicTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 基本数据类型
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
		
		//高精度值赋值给低精度数据类型，必须强制类型转换，反之则无须强制。
		int i = f;
		short k = (short) f;
		char j = (char) d;
		
		/**
		 * 转义字符
		 */
		char c1 = '\''; //单引号
		char c2 = '\\'; //反斜杠
		char c3 = '\"'; //双引号
		char c4 = '\n'; //换行符
		char c5 = '\t'; //垂直制表符
		char c6 = '\r'; //回车符
		System.out.print(c1);
		System.out.print(c5);
		System.out.print(c2);
		System.out.print(c6);
		System.out.print(c4);
		System.out.print(c3);
		
	}

}
