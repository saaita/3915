package ch04_control;
//while���� do{}while�� ������
public class Test19_while {
	public static void main(String[] args) {
		//while��
		int i=10000;
		while(i<=10){
			System.out.println("Hello");
		}//while-end
		
		//do~while��
		i=10000;
		do{
			System.out.println("Good");
			i++;
		}while(i<=10);
	}//main-end
}//class-end
