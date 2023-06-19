package ch04_control;
import java.util.Scanner;
public class Test04_if {
	public static void main(String[] args) {
		//문제 : 점수를 입력 받아서 학점 구하기
		//90~100 A
		//80~89 B
		//70~79 C
		//60~69 D
		//0~59 F
		
		char grade=' ';//변수선언 초기화, 학점넣을 변수
		Scanner scanner=new Scanner(System.in);
		System.out.print("점수입력>>");
		int score=scanner.nextInt();
		
		if(score>100 || score<0){
			System.out.println("0~100점 사이만 입력 하세요");
		}else{
			//정상적으로 입력 되었을 때
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
			System.out.println("점수 : "+score);
			System.out.println("학점 : "+grade);
		}//else-end
		
		
	}//main-end
}//class-end
