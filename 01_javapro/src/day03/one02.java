package day03;
import java.util.Scanner;

public class one02 {
	
	int a;
	int b;
	double c;
	
	double sum(){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		one02 test = new one02();
		System.out.println("1��°");
		test.a = s.nextInt();
		System.out.println("2��°");
		test.b = s.nextInt();
		System.out.println("3��°");
		test.c = s.nextDouble();
		System.out.println(test.sum());
	}//main-end
}//class-end




//	1. Ŭ���� ����
//		> ���� 3��(int�� 2��, double�� 1��)
//		> sum �޼ҵ� ȣ�� �� 3���� ���� ���ؼ� ����
//	2. main �޼��� ��ü ����
//	3. ��ü�� �ִ� 3�� ������ ��ĳ�ʷ� �Է¹޾� �ʱ�ȭ
//	4. sum �޼��� ȣ��
