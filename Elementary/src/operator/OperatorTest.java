package operator;

/**
 * ��������˵��Java ����������֪ʶ
 * @author win8
 *
 */
public class OperatorTest {

	/**���������ȼ����ɸߵ���
	һԪ��������  !  ++  --  - ~
	��ѧ����������λ�������� *  /  %  +  -  >>  <<  >>>
	�Ƚϲ�������>  <  >=  <=  !=  ==
	�߼���������(expression)? a:b 
	��ֵ�������� =  *=  -=  +=  /=  %=
	
	���˸�ֵ����������������ҵ���֮�⣬��������������Զ�������
	*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("--------------����˵������������ȼ������˳��------------------");
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
	
		System.out.println("-------------����˵���ԼӼ��Լ������������------------------");
		int m =0, i=1,j=1;
		i=m++;  //�Ȱ�m��ֵ����i,�ٰ�mֵ��1, ����iΪ0, m Ϊ1
		System.out.println("i="+i);
		System.out.println("m="+m);
		j=++m;  //�Ȱ�mֵ��1���ٸ�ֵ��j, ����mΪ2��jΪ2
		System.out.println("j="+j);
		System.out.println("m="+m);

		System.out.println("-------------������ѧ�����------------------");
		System.out.println("");
		System.out.println(2*4);
		System.out.println(8/2);
		System.out.println(7%3);
		
		System.out.println("-------------������λ�����------------------");
		System.out.println(-1 >>>1); //�߼�����1λ��ȥ�����
		System.out.println(-1 >> 1);
		System.out.println(2 >> 1);
		System.out.println(1 << 1);
		
		
	
	}

}
