package day03;

import java.util.Scanner;

public class one01 {
	public int width;
	public int height;
	
	public int Vaule(){
		return  width*height;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		one01 rect = new one01();
		System.out.println("�ʺ��Է� : ");
		rect.width = s.nextInt();
		System.out.println("�����Է� : ");
		rect.height = s.nextInt();
		
		
		
		
		
	}//main-end
}//class-end
