package ch04_control;

public class Test16_while {
	public static void main(String[] args) {

		//while문 : "목요일" 5번 출력
		int i=1;//변수선언
		while(i<=5){
			System.out.println("목요일");
			i++;
		}//while-end
		i=1;
		do{System.out.println("내일은 금요일");
		i++;
		}while(i<=5);

	}//main-end
}//class-end
