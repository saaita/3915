package day09;
import java.util.*;
public class BufferScan {
	public static void main(String[] args) {
		// ��ĳ�ʸ� ���ؼ� ���ڸ� �ϳ� �Է� �ް�
		//�� ������ ���ڿ�("�ȳ� �ݰ���")
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�");
		int a = s.nextInt();
		s.nextLine();
		
		System.out.println("���� �Է�");
		String b = s.nextLine();//nextLine=\n�� ���� nextInt�� �Է��ϸ� �׷��� b�� \n�� ��
		
		System.out.println("������� : "+a);
		System.out.println("������� : "+b);
		
		
	}
}
