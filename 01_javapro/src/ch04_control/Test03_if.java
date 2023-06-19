package ch04_control;
import java.util.Scanner;
public class Test03_if {
	public static void main(String[] args) {
		//문제 : 어떤수를 입력받아서 짝수인지 홀수인지 판정하여 출력하시오

		Scanner scanner=new Scanner(System.in);//객체생성

		// 8%2 ==>0 짝수
		// 7%2 ==>1 홀수
		// (7%2 !=0 ) ==>홀수

		System.out.print("임의의 수 입력>>");
		int su=scanner.nextInt();

		if(su%2==0){
			System.out.println(su+"는 짝수");
		}else if(su%2!=0){
			System.out.println(su+"는 홀수");
		}
	}//main-end
}//class-end
