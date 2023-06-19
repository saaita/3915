package ch04_control;

public class Test12_for {
	public static void main(String[] args) {
		//문제 1~10까지 합구하기
		
		int sum=0;
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		System.out.println(sum+"\n");
		//문제 1~20까지 짝수의 합 구하여 출력
		sum=0;
		
	
		for(int i=1; i<=20; i++){
			if(i%2==0){
				sum+=i;
			}
			
		}
		System.out.println(sum);
		
		
	}//main-end
}//class-end

//sum=sum+i
//1 <= 0 +1
//3 <= 1 +2
//6 <= 3 +3
//10<= 6 +4
//.
//.
//.
//.
//.
//55<= 45+10