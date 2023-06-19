package my_test;

import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 (ex: 000000-0000000): ");
        String juminNumber = scanner.nextLine();
        
        // 주민번호의 7번째 숫자로 성별을 판별합니다.
        char genderCode = juminNumber.charAt(7);
        
        if (genderCode == '1' || genderCode == '3') {
            System.out.println("남자입니다.");
        } else if (genderCode == '2' || genderCode == '4') {
            System.out.println("여자입니다.");
        } else {
            System.out.println("잘못된 주민번호입니다.");
        }
    }
}
