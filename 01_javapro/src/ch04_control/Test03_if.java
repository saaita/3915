package ch04_control;
import java.util.Scanner;
public class Test03_if {
	public static void main(String[] args) {
		//���� : ����� �Է¹޾Ƽ� ¦������ Ȧ������ �����Ͽ� ����Ͻÿ�

		Scanner scanner=new Scanner(System.in);//��ü����

		// 8%2 ==>0 ¦��
		// 7%2 ==>1 Ȧ��
		// (7%2 !=0 ) ==>Ȧ��

		System.out.print("������ �� �Է�>>");
		int su=scanner.nextInt();

		if(su%2==0){
			System.out.println(su+"�� ¦��");
		}else if(su%2!=0){
			System.out.println(su+"�� Ȧ��");
		}
	}//main-end
}//class-end
