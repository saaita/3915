package ch04_control;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//���� : ����� �Է¹޾Ƽ� ������� �����Ͽ� ����Ͻÿ�
		
		Scanner scanner=new Scanner(System.in);//��ü����
		System.out.print("������ ���� �Է�>>");//�ܼ��޼���
		int su=scanner.nextInt();//������ �Է¹޾Ƽ� su�� �Ҵ�
		
		if(su>0){
			System.out.println(su+"�� ���");
		}else{
			System.out.println(su+"�� ����ƴ�");
		}
	}//main-end
}//class-end
