package ch04_control;

public class Test14_for {
	public static void main(String[] args) {
		//문제
		//*
		//**
		//***
		//****
		for(int i=1; i<=5; i++){
			for(int j=1; j<=(6-i); j++){
				System.out.print('#');
			}//inner-for
			for(int k=1; k<=i; k++)
				
				System.out.print("*");
			System.out.println();
		}//out-for
		//문제
		//
		
	}//main-end
}//class-end
