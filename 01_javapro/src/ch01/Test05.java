package ch01;

//�Է±��
import java.util.Scanner; //JDK5 �߰��� ���

public class Test05 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.print("���� �Է�>>"); // ����
		int a = scan.nextInt();// ������ �Է� �޾Ƽ� a�� ����

		System.out.print("�Ǽ��Է�>>"); // Ű
		double d = scan.nextDouble();// �Ǽ����Է¹޾� d������

		System.out.print("���ڿ��Է�>>"); // �̸�
		String name = scan.next();// ���ڿ��� �Է¹޾Ƽ� name�� ����

		// ���
		System.out.printf("���� %d\n", a);// %d �������
		// System.out.printf("Ű %f\n",d);// %f �Ǽ� ���
		System.out.printf("Ű %5.1f\n", d);// %f �Ǽ� ��� // 5.1= 5�¼Ҽ������� 5�ڸ� 1���Ҽ���
											// ����
		System.out.printf("�̸� %s\n", name); // %s : ���ڿ����
		System.out.println();// �ٹٲ�

		System.out.printf("%-7s %-7s %-7s\n", "����", "Ű", "�̸�");
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
		System.out.printf("%-3d %-5.1f %-7s\n", a, d, name);
	}// main-end
}// class-end

