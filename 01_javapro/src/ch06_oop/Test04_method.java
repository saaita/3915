package ch06_oop;
//메서드 리턴값 예제
public class Test04_method {
	//int a=100;

	public int aa(){
		return 100;
	}//aa()-end

	public double bb(){
		return 12.5;
	}//bb()-end

	public String cc(){
		return "박은빈";
	}//cc()-end

	public static void main(String[] args) {

		Test04_method t=new Test04_method();///객체생성
		int a1=t.aa();
		double b1=t.bb();
		String str=t.cc();

		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);
		System.out.println("str:"+str);


	}//main-end
}//class-end
