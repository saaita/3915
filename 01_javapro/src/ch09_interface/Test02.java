package ch09_interface;
//인터페이스 실습
interface Aaaa{
	public void aa(int a);//추상메서드
}
interface Bbbb extends Aaaa{
	public void bb();//추상메서드

}
interface Cccc extends Bbbb{
	public void cc();//추상메서드
}

class Dddd implements Cccc{
	//오버라이딩 : 상속 받은 메서드 내용 재정의
	public void aa(int a){
		System.out.println("a : "+a);
		System.out.println("aa() called");
	}
	//오버라이딩
	public void bb(){
		System.out.println("bb() called");
	}
	//오버라이딩
	public void cc(){
		System.out.println("cc() called");
	}
}//class-end

public class Test02 {
	public static void main(String[] args) {
		Dddd d=new Dddd();//객체 생성, 생성자호출
		d.aa(100);
		d.bb();
		d.cc();
	}//main-end
}//class-end
