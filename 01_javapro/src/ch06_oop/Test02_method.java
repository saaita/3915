package ch06_oop;
// �޼��� : �Ű� ������ �ִ� �޼��� �ǽ�
// parameter=�Ű�����
public class Test02_method {
	public void aa(int a){
		System.out.println("aa() called...");
		System.out.println("a:"+a);
	}//aa
	public void bb(String name){
		System.out.println("bb() called...");
		System.out.println("name"+name);
	}//bb
	
	
	public static void main(String[] args) {
		Test02_method t2=new Test02_method();
		t2.aa(123);//��ü.�޼���(��)
		t2.bb("���¸�");
		
	}//main-end
}//class-end
