package day06;

import java.util.Scanner;

public interface Jumin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("주민번호 입력 ex)000000-0000000");
		String jumin = s.next();
		if(jumin.length() !=14){
			System.out.println("다시입력(14글자)");
			return;
		}
		if(jumin.substring(7,8).equals("1")
			|| jumin.substring(7,8).equals("3")){
			System.out.println("남자");
		}else{
			System.out.println("여자");
		}
		

	}
}
