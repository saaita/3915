package ch04_control;
//continue문 : 다시 반복 loop를 수행한다
public class Test21_continue {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){
			if(i%2==0)continue;
			System.out.print(i+" ");
		}//for-end
	}//main-end
}//class-end
