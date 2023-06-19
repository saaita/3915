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
		System.out.println("너비입력 : ");
		rect.width = s.nextInt();
		System.out.println("높이입력 : ");
		rect.height = s.nextInt();
		
		
		
		
		
	}//main-end
}//class-end
