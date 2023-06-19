package ch04_control;
import java.util.Scanner;
public class Test07_switch {
	public static void main(String[] args) {
		//월(달)입력 받아서 그 달의 날짜를 구하시오.
		
		int days=0;//변수선언
		Scanner scanner=new Scanner(System.in);//객체생성
		System.out.print("달을 입력 : ");
		int month=scanner.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 2:
			days=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		}//switch-end
		System.out.println(month+"월은 "+days+"일 까지 있습니다.");
	}//main-end
}//class-end
