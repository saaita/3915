package my_test;

import java.util.Scanner;

public class ���� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�ֹι�ȣ�� �Է��ϼ��� (ex: 000000-0000000): ");
        String juminNumber = scanner.nextLine();
        
        // �ֹι�ȣ�� 7��° ���ڷ� ������ �Ǻ��մϴ�.
        char genderCode = juminNumber.charAt(7);
        
        if (genderCode == '1' || genderCode == '3') {
            System.out.println("�����Դϴ�.");
        } else if (genderCode == '2' || genderCode == '4') {
            System.out.println("�����Դϴ�.");
        } else {
            System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
        }
    }
}
