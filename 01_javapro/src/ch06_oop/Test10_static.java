package ch06_oop;
//static �޼���� static���� ����� ����, �޼��常(ȣ��)��� �����ϴ�
//static ����,�޼���� ��ü���� �ʰ��� ��밡��
// ex : Ŭ�����̸�.�޼���() => Math.max(6,7)
// ex : Ŭ�����̸�.����		=> Math.PI


public class Test10_static {
	static int a=10;//��������, static
	
	public static void aa(){//static�޼���
		System.out.println("aa() called");
	}
	
	public void bb(){//�Ϲݸ޼���
		System.out.println("bb() called");
	}
	
	public static void main(String[] args) {
		System.out.println("a:"+a);//static���� ����x
		aa();//static�޼��� ȣ��
		
		Test10_static test10=new Test10_static();
		test10.bb();//�Ϲݸ޼���, ��ü�����Ͽ� ȣ���ϸ� �ȴ�
		
	}//main-end
}//class-end