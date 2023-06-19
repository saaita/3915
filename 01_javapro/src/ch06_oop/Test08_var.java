package ch06_oop;
// 전역변수 : 클래스안에,메서드 밖에서 선언된 변수. 자동 초기화 된다
// 지역변수 : 메서드안에서 선언된 변수. 자동초기화 안됨
// 배열은 지역일지라도 자동 초기화 된다

// 전역변수 예제
public class Test08_var {
	//전역변수 = 필드 = 자동초기화됨
	int age;
	double ki;
	String name;
	
	public static void main(String[] args) {
		int a;//자동 초기화 X
		
		//System.out.println("age:"+age);
		//에러 이유 : static 메서드는 static으로 선언된 변수,메서드만 사용가능
		
		//System.out.println("a:"+a);
		//에러 이유 : 지역변수는 자동 초기화 안됨
		
		Test08_var test08=new Test08_var();//객체생성,heap영역 메모리할당 받음
		System.out.println("test08.age:"+test08.age);//0
		System.out.println("test08.ki:"+test08.ki);//0.0
		System.out.println("test08.name:"+test08.name);//null
		
	}//main-end
}//class-end
