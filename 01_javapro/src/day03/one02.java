package day03;
import java.util.Scanner;

public class one02 {
	
	int a;
	int b;
	double c;
	
	double sum(){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		one02 test = new one02();
		System.out.println("1번째");
		test.a = s.nextInt();
		System.out.println("2번째");
		test.b = s.nextInt();
		System.out.println("3번째");
		test.c = s.nextDouble();
		System.out.println(test.sum());
	}//main-end
}//class-end




//	1. 클래스 생성
//		> 변수 3개(int형 2개, double형 1개)
//		> sum 메소드 호출 시 3개의 값을 더해서 리턴
//	2. main 메서드 객체 생성
//	3. 객체에 있는 3개 변수를 스캐너로 입력받아 초기화
//	4. sum 메서드 호출
