package ch04_control;
import java.util.Scanner;
//switch~case
public class Test05_switch {
	public static void main(String[] args) {
		//���� : ����� �Է¹޾� ¦������ Ȧ������ �����Ͽ� ����Ͻÿ�
		Scanner scanner=new Scanner(System.in);//��ü����
		System.out.print("������ �� �Է�>>");
		int su=scanner.nextInt();
		switch(su%2){
		case 0:
			System.out.println(su+"�� ¦��");
			break;
		case 1:
			System.out.println(su+"�� Ȧ��");
			break;
			
			
		}//switch-end
	}//main-end
}//class-end
