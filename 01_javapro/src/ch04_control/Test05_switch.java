package ch04_control;
import java.util.Scanner;
//switch~case
public class Test05_switch {
	public static void main(String[] args) {
		//문제 : 어떤수를 입력받아 짝수인지 홀수인지 판정하여 출력하시오
		Scanner scanner=new Scanner(System.in);//객체생성
		System.out.print("임의의 수 입력>>");
		int su=scanner.nextInt();
		switch(su%2){
		case 0:
			System.out.println(su+"는 짝수");
			break;
		case 1:
			System.out.println(su+"는 홀수");
			break;
			
			
		}//switch-end
	}//main-end
}//class-end
