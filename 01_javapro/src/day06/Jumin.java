package day06;

import java.util.Scanner;

public interface Jumin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է� ex)000000-0000000");
		String jumin = s.next();
		if(jumin.length() !=14){
			System.out.println("�ٽ��Է�(14����)");
			return;
		}
		if(jumin.substring(7,8).equals("1")
			|| jumin.substring(7,8).equals("3")){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		

	}
}
