package ch06_oop;
// �޼��� ȣ�� ����
// parameter = �Ű�����
// return �� ( ���ϰ� ���� ���� )
// public int sum(int a,int b){}
// public ������ sum(�Ű�����){}

public class Test03_method {
	public int sum(int a,int b){
		int s=a+b;
		return s;
	}

	public static void main(String[] args) {
		Test03_method t3=new Test03_method();//��ü����
		int aa=t3.sum(20, 30);
		t3.sum(100,  200);
		System.out.println("aa:"+aa);
	}//main-end
}//class-end
