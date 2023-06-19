package day01;

import java.util.Random;
import java.util.Scanner;

public class one {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		// String name = s.next();
		// int age = s.nextInt();

		/*
		 * for(int i=9; i>0; i--){ for(int j=9; j>0; j--){
		 * System.out.println(i+"*"+j+"="+(i*j)); } }
		 * 
		 * /*for(int i=1; i<=9; i++){ for(int j=1; j<=9; j++){
		 * 
		 * System.out.println(i+"*"+j+"="+(i*j)); } }
		 */


		int a =r.nextInt(100)+1;
		while (true) {
			System.out.println("1~100랜덤숫자 맞추기");


			for(int count=1;;){
				int j=s.nextInt();
				if(a==j){
					System.out.println("정답"+count+"번만에");
					break;
				}else if(a>j){
					System.out.println("up");	
					count++;
				}else if(a<j){
					System.out.println("down");
					count++;
				}

			}
		}
	}// main-end
}// class-end
