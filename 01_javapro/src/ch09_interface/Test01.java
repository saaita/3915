package ch09_interface;
//인터 페이스 실습
interface Aaa{
	int MAX=100;// static final int MAX=100; , 값변경 못함
	public void aa();//추상메서드
	public void bb();//추상메서드
}//interfave-end

class Bbb implements Aaa{
	//오버라이딩
	public void aa(){
		System.out.println("aa() called");
		System.out.println("MAX:"+MAX);
		//MAX=200;//값변경 못함
	}
	//오버라이딩
	public void bb(){
		System.out.println("bb() called");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Aaa a=new Bbb();//상위클래스 변수로 하위객체 생성
		a.aa();
		a.bb();
	}//main-end
}//class-end
