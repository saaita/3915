package ch04_control;

public class Test12_for {
	public static void main(String[] args) {
		//���� 1~10���� �ձ��ϱ�
		
		int sum=0;
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		System.out.println(sum+"\n");
		//���� 1~20���� ¦���� �� ���Ͽ� ���
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