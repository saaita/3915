package ch06_oop;
// 메서드 호출 예제
// parameter = 매개변수
// return 값 ( 리턴값 돌려 예제 )
// public int sum(int a,int b){}
// public 리턴형 sum(매개변수){}

public class Test03_method {
	public int sum(int a,int b){
		int s=a+b;
		return s;
	}

	public static void main(String[] args) {
		Test03_method t3=new Test03_method();//객체생성
		int aa=t3.sum(20, 30);
		t3.sum(100,  200);
		System.out.println("aa:"+aa);
	}//main-end
}//class-end
