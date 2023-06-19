package ch04_control;
//while문과 do{}while의 차이점
public class Test19_while {
	public static void main(String[] args) {
		//while문
		int i=10000;
		while(i<=10){
			System.out.println("Hello");
		}//while-end
		
		//do~while문
		i=10000;
		do{
			System.out.println("Good");
			i++;
		}while(i<=10);
	}//main-end
}//class-end
