package ch03_oper;

public class Test08 {
	public static void main(String args[]){
		
		int a=(7>5)?7:5; // a=7
		int b=(7<5)?7:5; // b=5
		System.out.println(a);
		System.out.println(b);
		
		int pageCount=(37/10)+((37%10==0)?0:1);
		System.out.println(pageCount);//페이지수4
		
		//강제형변환=명시적형변환=캐스팅=casting
		char ch=(char)65;//A
		int i=(int)66.7; //66
		System.out.println(ch);
		System.out.println(i);
		
	}//main-e
}//class-end
