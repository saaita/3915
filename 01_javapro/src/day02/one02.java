package day02;

//0이 입력되기 전까지 입력된 숫자들 더하기(음수 입력 시 다시 입력하도록)
import java.util.Scanner;

public class one02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int num = s.nextInt();
			if (num < 0) {
				System.out.println("다시입력");
			} else {
				sum += num;
			}
			if (num == 0) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println(sum);

	}// main-end
}// class-end
