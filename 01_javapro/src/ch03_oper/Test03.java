package ch03_oper;
//관계연산자
// 	>	>=	<	<=	==	!=

public class Test03 {
	public static void main(String[] args) {
		int a=7, b=5;
		
		System.out.println(a>b);	//t
		System.out.println(a>=b);	//t
		System.out.println(a<b); 	//f
		System.out.println(a<=b); 	//f
		System.out.println(a==b); 	//f
		System.out.println(a!=b); 	//t
		//
		if(a>b){
			System.out.println("a>b");
		}
		a=1;
		b=5;
		if(a>=b){
			System.out.println("a>=b");
		}else{
			System.out.println("a>=b 아니다");
		}
	}//main-end
}//class-end
