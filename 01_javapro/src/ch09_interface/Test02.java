package ch09_interface;
//�������̽� �ǽ�
interface Aaaa{
	public void aa(int a);//�߻�޼���
}
interface Bbbb extends Aaaa{
	public void bb();//�߻�޼���

}
interface Cccc extends Bbbb{
	public void cc();//�߻�޼���
}

class Dddd implements Cccc{
	//�������̵� : ��� ���� �޼��� ���� ������
	public void aa(int a){
		System.out.println("a : "+a);
		System.out.println("aa() called");
	}
	//�������̵�
	public void bb(){
		System.out.println("bb() called");
	}
	//�������̵�
	public void cc(){
		System.out.println("cc() called");
	}
}//class-end

public class Test02 {
	public static void main(String[] args) {
		Dddd d=new Dddd();//��ü ����, ������ȣ��
		d.aa(100);
		d.bb();
		d.cc();
	}//main-end
}//class-end
