package day03;

public class Mun01 {
	public static void main(String[] args) {

		for(int i=2; i<10; i++){
			System.out.println(i+"��");
			for(int j=1; j<10; j++){
				if(i == 5){
					continue;
				}else{
					System.out.println(i+"X"+j+"="+i*j);
				}
				
			}
		}
		
	}//main-end
}//class-end


//1. �����ܿ��� 5���� �����ϰ� ���
//2. 5���� ���ڸ� �Է¹޾Ƽ� �迭 �����. ��, Ȧ���� ������
//3. {5, 3, 10, 2, 9, 8}
//	�������� �����ϱ�. ��, Ȧ������ �����ϰ� ¦�� ����
//	ex) {3, 5, 9, 2, 8, 10}
//	-> Arrays.sort() �ᵵ ��
//	-> Ȧ��, ¦���� ������ ���ٰ� ����
//4. Calculator Ŭ���� ����
//	1. �ΰ��� ������ �Ű������� �޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//	2. 3���� ������ �Է¹޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//	3. 4���� �Ǽ�(double)�� �Է¹޾Ƽ� ���� ū ���� �������ִ� max �޼ҵ� ����