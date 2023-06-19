package ch03_oper;
// == : 기본 자료형 비교할 때 사용
// equals() : 문자열 비교(대,소문자 구분하여 비교)
// equalsIgnoreCase() : 문자열 비교(대,소문자 구분 않고 비교)

// 객체 instanceof 클래스 : 객체비교
public class Test09 {
	public static void main(String args[]){
		
		
		//기본자료형 : boolean, byte,short,int,long,double
		//기본 자료형 비교
		int a=10, b=10;
		if(a==b){
			System.out.println("a==b");
		}else{
			System.out.println("a|!=b");
		}
		//=============
		//equals()
		//equalsIgnoreCase()
		String str1="hello";
		String str2="hello";
		String str3="Hello";
		
		System.out.println(str1.equals(str2));//t
		System.out.println(str1.equals(str3));//f (대소문자 구분때문)
		System.out.println(str1.equalsIgnoreCase(str3));//t(대소문자 구분x)
		
		//객체 instanceof 클래스
		String str=new String("aaa");//객체생성
		Object ob=new Object();//객체생성
		
		System.out.println(str instanceof String);//t
		System.out.println(str instanceof Object);//t
		System.out.println(ob instanceof Object);//t
		System.out.println(ob instanceof String);//f
		System.out.println();//줄바꿈
		
		
		
	}//main-end
}//class-end
