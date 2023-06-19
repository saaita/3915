package day06;

import java.util.Scanner;


public class CompareTo {
	public static void main(String[] args) {
		
		String s1 = "\t   test   \n";
		String s2 = "     test     ";
		
		System.out.println(s1/*.trim*/);//trim<<공백제거
		System.out.println(s2.trim());
		
		//스캐너로 두개 문자열 입력받기
		//소문자는 대문자로 바꿔서 비교
		/*Scanner s = new Scanner(System.in);
		System.out.println("입력");
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		String a = s.next();
		String b = s.next();
		a=a.toUpperCase();
		b=b.toUpperCase();
		
		int res = a.compareTo(b);
		if(res == 0)
			System.out.println("the same");
		else if (res < 0)
			System.out.println(a+"<"+b);
		else
			System.out.println(a+">"+b);
		
		
		/*String java= "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("the same");
		else if(res <0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);
			*/
	}
}
