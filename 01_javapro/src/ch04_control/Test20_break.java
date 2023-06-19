package ch04_control;
//break문 :
//switch ~case 블럭을 탈출할때 사용
//반복 loop 탈출
public class Test20_break {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++){
			System.out.println(i+" ");
			if(i==10)
				break;
		}//for-end
		System.out.println();
		
		int a=1;//변수
		while(a<=15){
			System.out.print(a+" ");
			if(a==10)
				break;
			a++;
		}
			
	}//main-end
}//class-end
