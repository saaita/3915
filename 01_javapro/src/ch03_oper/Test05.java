package ch03_oper;

public class Test05 {
	public static void main(String args[]){
		int a=10;	//00000000 00000000 00000000 00001010
		int b=7;	//00000000 00000000 00000000 00000111
		//00000000 00000000 00000000 00001010
		//00000000 00000000 00000000 00000111
	  // |00000000 00000000 00000000 00001111
		
		System.out.println(a&b);//2
		System.out.println(a|b);//15
		
	}//main-end
}//class-end
