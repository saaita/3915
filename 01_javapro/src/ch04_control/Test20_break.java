package ch04_control;
//break�� :
//switch ~case ���� Ż���Ҷ� ���
//�ݺ� loop Ż��
public class Test20_break {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++){
			System.out.println(i+" ");
			if(i==10)
				break;
		}//for-end
		System.out.println();
		
		int a=1;//����
		while(a<=15){
			System.out.print(a+" ");
			if(a==10)
				break;
			a++;
		}
			
	}//main-end
}//class-end
