package ch04_control;

public class Test18_while {
	public static void main(String[] args) {


		//while�� : 1~10 ¦�������

		int i = 1;
		while(i<=10){

			if(i%2==0){
				System.out.print(i);
			}//if
			i++;		
		}//while-end
		System.out.println();
		//do~while 10~20 3�ǹ��
		i=10;
		do{if(i%3==0){
		System.out.println(i);
		}i++;
		}
		while(i<=20);

	}//main-end
}//class-end
