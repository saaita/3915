package ch09_interface;
//인터페이스

interface Animal{
	public void cry();//추상메서드
}
class Cat implements Animal{
	//오버라이딩
	public void cry(){
		System.out.println("야옹 야옹 야오오옹~~~");
	}
}

class Dog implements Animal{
	//오버라이딩
	public void cry(){
		System.out.println("멍 멍 왈 왈 왈~~");
	}
}
public class Test03 {
	public static void main(String[] args) {
		Animal ani=new Cat();//상위 클래스 변수로 하위 객체 처리
		ani.cry();
		
		ani=new Dog();//객체생성
		ani.cry();
	}//main-end
}//class-end
