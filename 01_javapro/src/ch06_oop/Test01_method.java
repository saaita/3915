package ch06_oop;
// �޼��� �ǽ�
// �Լ��� �ڹٿ����� �޼����� �Ѵ�
// �޼���� ó���� �⺻ ���� �̴�(�޼��� ������ ó���ȴ�)
// �޼���� Ŭ���� �ȿ����� �� �� �ִ�.
// ���� ó���� �޼��� �ȿ��� ���� �� �ִ�.

// main() : JVM�� ���� ���ʷ� ȣ��ȴ�
			// JVM : �ڹ� ���� �ӽ� , ����Ʈ�������� cpu
public class Test01_method {
	public void aa(){
		System.out.println("������ �ݿ���");
	}//aa()
	
	public void bb (){
		System.out.println("������ �����");
	}//bb()
	
	public static void main(String[] args) {
	
		Test01_method test01=new Test01_method();//��ü����
		test01.aa();
		test01.bb();
	}//main-end
}//class-end
