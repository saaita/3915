package ch01;

//입력기능
import java.util.Scanner; //JDK5 추가된 기능

public class Test05 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.print("정수 입력>>"); // 나이
		int a = scan.nextInt();// 정수를 입력 받아서 a에 저장

		System.out.print("실수입력>>"); // 키
		double d = scan.nextDouble();// 실수를입력받아 d에저장

		System.out.print("문자열입력>>"); // 이름
		String name = scan.next();// 문자열을 입력받아서 name에 저장

		// 출력
		System.out.printf("나이 %d\n", a);// %d 정수출력
		// System.out.printf("키 %f\n",d);// %f 실수 출력
		System.out.printf("키 %5.1f\n", d);// %f 실수 출력 // 5.1= 5는소수점포함 5자리 1은소수점
											// 갯수
		System.out.printf("이름 %s\n", name); // %s : 문자열출력
		System.out.println();// 줄바꿈

		System.out.printf("%-7s %-7s %-7s\n", "나이", "키", "이름");
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
	}// main-end
}// class-end

