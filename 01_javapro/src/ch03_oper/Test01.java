package ch03_oper;
//��������� +���� -���� *���ϱ� /������ %������
//����/����=�� ����page���, �Խ���page���
//�Ǽ�/����=�Ǽ�(�ڷ����� ū������ �ڵ� ����ȯ �ȴ�)
// %(������)
public class Test01 {
	public static void main(String[] args) {
		int a=10,b=7;
		int s1=a+b;
		int s2=a-b;
		int s3=a*b;
		int s4=a/b;//��
		int s5=a%b;//������
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		//
		int pageCount=37;
		System.out.println(pageCount/10);
		System.out.println(pageCount%10);
		
		System.out.println("��������:"+((pageCount/10)+((pageCount%10==0)?0:1)));
		//
		// �ڵ� ����ȯ
		double x=37.0;
		System.out.println(x/10);
		System.out.println(37.0/10);
	}//main-end
}//class-end
