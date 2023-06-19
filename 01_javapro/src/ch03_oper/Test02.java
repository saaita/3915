package ch03_oper;
//증감연산자
// ++ : 1증가 
// -- : 1감소
// a++ : 후위 연산
// ++a : 전위 연산
public class Test02 {
	public static void main(String[] args) {
		int a=5;
			System.out.println(a++);// 6
		
		int b=5;
			System.out.println(++b);// 6
		
		int x=++a + b--;
		//	   7  + 6
			System.out.println("x:"+x);
		
			a=5;
		int y=++a + ++a;
		//     6(보관)+보관된6++1
			System.out.println(y);//13 14(c언어는)
		
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}
			System.out.println();//ln
		
		for(char ch='A'; ch<='Z'; ch++){//유니코드값
			System.out.print(ch);
		}
			System.out.println();//줄바꿈
		for(int d=65; d<=90; d++){
			System.out.print((char)d);
		}
			
	}//main-end
}//class-end
