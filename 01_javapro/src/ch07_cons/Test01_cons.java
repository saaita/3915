package ch07_cons;
// ������ �ǽ�
// ����Ʈ �����ڴ� �����ڸ� ���� ������ �ڵ����� ���������
// ���� �ִ� �����ڰ� ������ / ����Ʈ �����ڴ� �ڵ����� �ȸ��������
// �����ڴ� �μ��� ������ �����ε� �����ϴ�
class Sungjuk{
	//��������
	String name;
	int kor;
	
	//���� ���� ����Ʈ ������
	public Sungjuk(){
		//this.name="";
		//this.kor=0;
		System.out.println("����Ʈ ������ ȣ��");
	}//Sungjuk()-end
	
	//���� �ִ� ������
	public Sungjuk(String name){
		this.name=name;
		//this.kor=0; //�������� : �ڵ��ʱ�ȭ �Ǳ� ����
		System.out.println("String name ���� �ִ� ������ ȣ��");
		System.out.println("name:"+name);
	}
	
	//���� �ִ� ������
	public Sungjuk(String name,int kor){
		this.name=name;
		this.kor=kor;
		System.out.println("String name, int kor ���� �ִ� ������ ȣ��");
		System.out.println("�̸�:"+name);
		System.out.println("��������:"+kor);
	}
	
}//class-Sungjuk-end
public class Test01_cons {
	public static void main(String[] args) {
		new Sungjuk();//��ü����, ������ ȣ��
		new Sungjuk("kim");//��ü����, ������ ȣ��
		new Sungjuk("lee",90);//��ü����, ������ ȣ��
	}//main-end
	
}//class-end
