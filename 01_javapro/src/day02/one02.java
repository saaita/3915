package day02;

//0�� �ԷµǱ� ������ �Էµ� ���ڵ� ���ϱ�(���� �Է� �� �ٽ� �Է��ϵ���)
import java.util.Scanner;

public class one02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int num = s.nextInt();
			if (num < 0) {
				System.out.println("�ٽ��Է�");
			} else {
				sum += num;
			}
			if (num == 0) {
				System.out.println("����");
				break;
			}
		}
		System.out.println(sum);

	}// main-end
}// class-end
