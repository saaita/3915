package day06;

import java.util.Scanner;


public class CompareTo {
	public static void main(String[] args) {
		
		String s1 = "\t   test   \n";
		String s2 = "     test     ";
		
		System.out.println(s1/*.trim*/);//trim<<��������
		System.out.println(s2.trim());
		
		//��ĳ�ʷ� �ΰ� ���ڿ� �Է¹ޱ�
		//�ҹ��ڴ� �빮�ڷ� �ٲ㼭 ��
		/*Scanner s = new Scanner(System.in);
		System.out.println("�Է�");
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
