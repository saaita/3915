package day09;
import java.util.*;
public class game {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1p ���� ������ ����");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("����ð��� �� : "+s1+"��");
		System.out.println("10�ʿ� ������ ����");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("�����ð� �� :"+s2+"��");
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
 		System.out.println("�������̴�"+(sen));
 		
 		System.out.println();
 		System.out.println("2p ���� ������ ����");
 		s.nextLine();
 		Calendar now2 = Calendar.getInstance();
 		int s3 = now2.get(Calendar.SECOND);
 		System.out.println("����ð��� �� : "+s3+"��");
 		System.out.println("10�ʿ� ������ ����");
 		s.nextLine();
 		now2 = Calendar.getInstance();
 		int s4 = now.get(Calendar.SECOND);
 		System.out.println("�����ð� �� :"+s4+"��");
 		int sen2 = (s4 > s3) ? s4-s3 : (s4+60) - s3;
 		System.out.println("�������̴�"+(sen2));
 		
 		if(sen<sen2){
 			System.out.println("1p�¸�");
 			
 			
 		}else if(sen==sen2){
 			System.out.println("�����ϴ�.");
 		}
 		else{
 			System.out.println("2p�¸�");
 		}
	}
}
