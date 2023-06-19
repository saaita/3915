package ch04_control;

public class Test11_for {
	public static void main(String[] args) {
		//1~10까지 짝수만 출력하시오 for,if문 사용
		
		for(int i=1; i<=10; i++){
			if(i%2==0){
			System.out.print(i+" ");
			}
		}//for-end
		System.out.println();
		//==================
		for(int i=1; i<=1000; i++){
			if(i%17==0){
				System.out.print(i+" ");
			}
		}
	}//main-end
}//class-end
