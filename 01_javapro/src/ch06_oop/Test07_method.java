package ch06_oop;
//�޼��� ����
public class Test07_method {
	public void star(){

		for(int i=1; i<=4; i++){//��
			for(int j=1; j<=(5-i); j++){//��
				System.out.print(" ");
			}//inner-for
			for(int k=1; k<=(i*2-1); k++){//��
				System.out.print("*");
			}//inner-for

			System.out.println();//�ٹٲ�
		}//out-for
	}//star()-end

	public static void main(String[] args) {
		
		Test07_method test07=new Test07_method();//��ü���� heap���� �޸��Ҵ�
		test07.star();
	}//main-end

}//class-end
