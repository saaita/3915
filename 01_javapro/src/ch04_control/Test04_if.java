package ch04_control;
import java.util.Scanner;
public class Test04_if {
	public static void main(String[] args) {
		//���� : ������ �Է� �޾Ƽ� ���� ���ϱ�
		//90~100 A
		//80~89 B
		//70~79 C
		//60~69 D
		//0~59 F
		
		char grade=' ';//�������� �ʱ�ȭ, �������� ����
		Scanner scanner=new Scanner(System.in);
		System.out.print("�����Է�>>");
		int score=scanner.nextInt();
		
		if(score>100 || score<0){
			System.out.println("0~100�� ���̸� �Է� �ϼ���");
		}else{
			//���������� �Է� �Ǿ��� ��
			if(score<=100 && score>=90){
				grade='A';
			}else if(score>=80){
				grade='B';
			}else if(score>=70){
				grade='C';				
			}else if(score>=60){
				grade='D';
			}else{
				grade='F';
			}//else-end	
			System.out.println("���� : "+score);
			System.out.println("���� : "+grade);
		}//else-end
		
		
	}//main-end
}//class-end
