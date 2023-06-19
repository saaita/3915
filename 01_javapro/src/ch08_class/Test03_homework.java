package ch08_class;
import java.util.Scanner;

public class Test03_homework {
	public static void main(String[] args) {
		// 주민번호를 입력 받아 남자인지 여자인지 판정하여 출력하시오
		// (문자열)입력 받고 : 주민번호,전화번호,우편번호
		Scanner scanner=new Scanner(System.in);
		System.out.print("주민번호 입력>>");
		String juminNo=scanner.next();
		//
		String no=juminNo.substring(7,8);
		//System.out.println("no:"+no);
		
		if(no.equals("1")||no.equals("3")){
			System.out.println(juminNo+"\n남자");
		}else if(no.equals("2")||no.equals("4")){
			System.out.println(juminNo+"\n여자");
		}
		
		//------------
		//문자열을 숫자로 변환
		//-------------
		int num=Integer.parseInt(no);//**************
		//System.out.println("num:"+num);
		if(num==1 || num==3){
			System.out.println(juminNo+"남자");
		}else if(num==2 || num==4){
			System.out.println(juminNo+"여자");
		}
		
		// switch~case
		switch(num){
		case 1:
		case 3:
			System.out.println(juminNo+"남자case");
			break;
		case 2:
		case 4:
			System.out.println(juminNo+"여자case");
		}//switch-end

		
		//입력 받아 출력
		// 881219-1
		// 881219-2
		// 221219-3
		// 221219-4
	}//main-end
}//class-end
