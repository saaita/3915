package day02;

public class one01 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++)//i+=3 �ϸ� if���� �Ƚᵵ 3,6,9 �����̶� ��°���
			for(int j=1; j<=9; j++){
				if(i%3==0){
					System.out.println(i*j);
				}//if-end
			}//for-end
				
		
		
	}//main-end
}//class-end
