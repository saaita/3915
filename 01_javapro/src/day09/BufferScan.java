package day09;
import java.util.*;
public class BufferScan {
	public static void main(String[] args) {
		// 스캐너를 통해서 숫자를 하나 입력 받고
		//그 다음에 문자열("안녕 반가워")
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = s.nextInt();
		s.nextLine();
		
		System.out.println("문자 입력");
		String b = s.nextLine();//nextLine=\n이 남음 nextInt를 입력하면 그래서 b에 \n이 들어감
		
		System.out.println("숫자출력 : "+a);
		System.out.println("문자출력 : "+b);
		
		
	}
}
