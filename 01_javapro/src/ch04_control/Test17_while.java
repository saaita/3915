package ch04_control;

public class Test17_while {
	public static void main(String[] args) {
		//while문 : 1 2 3,,,,,,,8 9 10까지 출력
		int i = 1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}
		System.out.println();//while-end
		//
		//do~ while문 10~20
		i=10;
			do{System.out.println(i);
				i++;
			}while(i<=20);
	}//main-end
}//class-end
