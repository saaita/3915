package ch06_oop;
//전역변수 : 클래스안에, 메서드밖에 선언. 자동초기화 된다
class SinSang{
	String name;//전역변수
	int age;

	//메서드

	public void setData(String name,int age){
		this.name=name;//this.전역변수=매개변수
		this.age=age;
	}//setDate()-end

	//출력 메서드
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}//disp()-end
}//class-end
public class Test09_var {
	public static void main(String[] args) {
		
		SinSang ss=new SinSang();//객체생성,heap영역메모리 할당
		ss.setData("박은빈",30);
		ss.disp();
		//
		ss.setData("박문수",45);
		ss.disp();


	}//main-end
}//class-end
