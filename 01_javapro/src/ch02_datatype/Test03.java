package ch02_datatype;

public class Test03 {
	public static void main(String args[]){
	/*  byte	: 1byte (-128 ~ +127) ( 1bit 8개 모여서 1byte)
		short	: 2byte (-32,768 ~ +32,767)
		int		: 4byte (-2,147,483,648 ~ +2,147,483,647)
		long	: 8byte (-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807)
	*/
		byte a1=127;
		byte a6=Byte.MIN_VALUE;
		short a2=32767;
		int a3=2147483647;
		long a4=Long.MAX_VALUE;
		long a5=Long.MIN_VALUE;
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("a4:"+a4);
		System.out.println("a5:"+a5);
		System.out.println(a6);
		
		//float f1=12.5;//에러 , double이 디폴트이다
		float f1=12.7f; // f를 포함시켜야 에러가 안남
		double d1=12.7; //double이 디폴트이다.
		
		System.out.println("f1:"+f1);//정밀도가 낮다
		System.out.println("d1:"+d1);//정밀도가 높다
	}
}
