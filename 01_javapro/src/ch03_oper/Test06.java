package ch03_oper;
//shift연산
public class Test06 {
	public static void main(String[] args) {
		int a=7;
		int c=a<<2;
		//	00000000 00000000 00000000 00000111
		//	00000000 00000000 00000000 00011100//28
		System.out.println(c);//28
		
		a=7;
		int d=a>>2;
		//	00000000 00000000 00000000 00000111
		//	00000000 00000000 00000000 00000001 //1
		System.out.println(d);
		
		//boolean 연산자
		boolean bb=true;
		bb=!bb;
		System.out.println(bb);//f
	}//main-end
}//class-end
