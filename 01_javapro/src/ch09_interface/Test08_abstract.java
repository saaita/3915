package ch09_interface;

abstract class Animal3{
	//변수
	public String sName;

	//생성자
	//일반 메서드
	public void move(){
		System.out.println("어슬렁 거리다");
	}

	//추상메서드
	public abstract void howl();

}//class-end

//파생 클래스
class Dog3 extends Animal3{
	//변수
	//생성자

	//일반 메서드 오버라이딩
	public void move(){
		System.out.println("팔짝 팔짝");
	}
	//추상메서드 오버라이딩
	public void howl(){
		System.out.println("멍멍~");
	}
}//class-end

//파생클래스
class Cat3 extends Animal3{
	//변수
	//생성자
	//메서드 : 추상 메서드 오버라이딩
	public void howl(){
		System.out.println("야옹 야옹~~");
	}
}//class-end
public class Test08_abstract {
	public static void main(String[] args) {
		Dog3 d=new Dog3();//객체생성 , 생성자 호출
		Cat3 c=new Cat3();//객체생성 , 생성자 호출

		d.move();
		d.howl();
		System.out.println();
		c.move();
		c.howl();
		
	}//main-end
}//class-end
