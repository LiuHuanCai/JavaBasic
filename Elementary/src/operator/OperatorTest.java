package operator;

/**
 * 本类用于说明Java 操作符基础知识
 * @author win8
 *
 */
public class OperatorTest {

	/**操作符优先级，由高到低
	一元操作符：  !  ++  --  - ~
	数学操作符，移位操作符： *  /  %  +  -  >>  <<  >>>
	比较操作符：>  <  >=  <=  !=  ==
	逻辑操作符：(expression)? a:b 
	赋值操作符： =  *=  -=  +=  /=  %=
	
	除了赋值操作符结合性是由右到左之外，其他操作符结合性都由左到右
	*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("--------------测试说明运算符的优先级及结合顺序------------------");
		int x=1,y=1,z=1;
		boolean a=(x+y+(2*z)-(2/2)) >(3-1);
		System.out.println(a);
		System.out.println(8-2-3>2);
		System.out.println(8/2/3);
		int b = 8/2/3;
		System.out.println(b);
		int c,d;
		d = (c=8/2/3)+1;
		System.out.println(d);
	
		System.out.println("-------------测试说明自加及自减运算符的运用------------------");
		int m =0, i=1,j=1;
		i=m++;  //先把m的值赋给i,再把m值加1, 所以i为0, m 为1
		System.out.println("i="+i);
		System.out.println("m="+m);
		j=++m;  //先把m值加1，再赋值给j, 所以m为2，j为2
		System.out.println("j="+j);
		System.out.println("m="+m);

		System.out.println("-------------测试数学运算符------------------");
		System.out.println("");
		System.out.println(2*4);
		System.out.println(8/2);
		System.out.println(7%3);
		
		System.out.println("-------------测试移位运算符------------------");
		System.out.println(-1 >>>1); //逻辑右移1位：去掉最后
		System.out.println(-1 >> 1);
		System.out.println(2 >> 1);
		System.out.println(1 << 1);
		
		
	
	}

}
