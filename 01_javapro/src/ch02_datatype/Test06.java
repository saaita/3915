package ch02_datatype;

public class Test06 {
	public static void main(String[] args) {
	//����� �ڷ����� ū������ �ڵ� ����ȯ �ȴ�
		System.out.println(10+2.5);
		
		double d=100;
		System.out.println(d);
		
		//����,�Ҵ�ÿ��� �����ڷ����� ũ�� �Ҵ�Ǹ鼭 �����ڷ������� ��ȯ�ȴ�
		
		//int a=12.5;//����
		//int = double
		
		//2.��������ȯ
		//�Ҵ�,���Խ� ĳ�����Ѵ�.
			int a=(int)12.5; //ĳ����(����ȯ)
			char ch=(char)65; //�ƽ�Ű����
			char ch2=(char)66.5; //�ƽ�Ű����
			
			System.out.println(a);
			System.out.println(ch);
			System.out.println(ch2);
	}
}
