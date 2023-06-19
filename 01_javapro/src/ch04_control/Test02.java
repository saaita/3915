package ch04_control;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//문제 : 어떤수를 입력받아서 양수인지 판정하여 출력하시오
		
		Scanner scanner=new Scanner(System.in);//객체생성
		System.out.print("임의의 정수 입력>>");//단순메세지
		int su=scanner.nextInt();//정수를 입력받아서 su에 할당
		
		if(su>0){
			System.out.println(su+"은 양수");
		}else{
			System.out.println(su+"은 양수아님");
		}
	}//main-end
}//class-end
