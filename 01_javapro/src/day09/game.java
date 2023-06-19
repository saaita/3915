package day09;
import java.util.*;
public class game {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1p 엔터 누르면 시작");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("현재시간의 초 : "+s1+"초");
		System.out.println("10초에 가깝게 엔터");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("누른시간 초 :"+s2+"초");
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
 		System.out.println("둘의차이는"+(sen));
 		
 		System.out.println();
 		System.out.println("2p 엔터 누르면 시작");
 		s.nextLine();
 		Calendar now2 = Calendar.getInstance();
 		int s3 = now2.get(Calendar.SECOND);
 		System.out.println("현재시간의 초 : "+s3+"초");
 		System.out.println("10초에 가깝게 엔터");
 		s.nextLine();
 		now2 = Calendar.getInstance();
 		int s4 = now.get(Calendar.SECOND);
 		System.out.println("누른시간 초 :"+s4+"초");
 		int sen2 = (s4 > s3) ? s4-s3 : (s4+60) - s3;
 		System.out.println("둘의차이는"+(sen2));
 		
 		if(sen<sen2){
 			System.out.println("1p승리");
 			
 			
 		}else if(sen==sen2){
 			System.out.println("비겼습니다.");
 		}
 		else{
 			System.out.println("2p승리");
 		}
	}
}
