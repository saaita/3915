package ch05_array;
//�������� : �ڵ����� �ʱ�ȭ ��(�޼��� �ۿ��� ����� ��)
//�������� : �ڵ����� �ʱ�ȭ �ȵ�
//�迭 	 : ���������� �ڵ����� �ʱ�ȭ��
public class Test04 {
	public static void main(String[] args) {
		
		int a[]=new int[3]; //0
		double b[]=new double[3]; //0.0
		char c[]=new char[3]; // ����
		String d[]=new String[3]; // null = ""
		
		for(int i=0; i<3; i++){
			System.out.println(a[i]+"--"+b[i]+"--"+c[i]+"--"+d[i]);
		}//for-end
	}//main-end
}//class-end
