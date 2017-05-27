package com.flow;

/**
 * 本类用于说明用于流程控制的语句
 * @author win8
 *
 */
public class FlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if_else(4);
		if_else(2);
		if_else(0);
		switch_case(1);
		switch_case(2);
		switch_case(3);
		switch_case(5);
		while_true(1);
		while_true(10); //
		do_while(1);
		do_while(10); //
		for_loop(5);
		multi_loop();
		
	}
	
	
    /*分支语句*/
	
	public static void if_else(int x){
		System.out.println("test if_else");
		if( x > 3) {
			System.out.println(x+"大于3.");
		}else if(x >0){
			System.out.println(x+"大于0 小于3.");
		}else {
			System.out.println(x+"小于等于0.");
		}	
	}

	public static void switch_case(int x){
		System.out.println("test switch:"+x);
		switch(x) {
		case 1: System.out.println("case 1");
		case 2: System.out.println("case 2"); break;
		default: System.out.println("default");
		case 3: System.out.println("case 3"); break;
		
		}
	}
	/*循环语句*/
	public static void while_true(int i){
		System.out.println("test while : "+i);
		while(i<10) {
			System.out.print(i+", ");
			i++;
		}
		System.out.println();
	}
	
	public static void do_while(int i){
		System.out.println("test do while : " +i);
		do {
			System.out.print(i+", ");
			i++;
		}while (i <10);
		System.out.println();
	}
	
	public static void for_loop(int x){
		System.out.println("test for loop end: "+x);
		for (int i=0; i<x; i++) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
	
   /*多重循环*/
	public static void multi_loop() {
		System.out.println("test multi loop");
loop1:		for(int i = 0; i < 4; i++) {
loop2:			for(int j=0; j< 4; j++) {
				if(i==2) continue loop1;
				if(i==3) break loop1;
				if(j==2) continue loop2;
				if(j==3) break; //等价于 break loop2
				System.out.println("i="+i+"; j="+j);
			}
			System.out.println("i="+i);
		}
		
		
	}
}
