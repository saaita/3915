package ch04_control;

public class Test10_for {
	public static void main(String[] args) {
		//자료형 변수명=값;
		//int a=10;
		
		//문제 : A~Z출력
		
		for(int i=65; i<=90; i++){
			System.out.print((char)i);
		}//for-end
		System.out.println();
		
		for(char ch='A'; ch<='Z';ch++){
			System.out.print(ch);
		}
	}//main-end
}//class-end
