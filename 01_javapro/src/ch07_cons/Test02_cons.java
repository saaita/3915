package ch07_cons;
//������ �����ε�

class SinSang{
	//��������
	String name;
	int age;
	
	//����Ʈ ������
	public SinSang(){
		System.out.println("����Ʈ ������ ȣ��");
	}
	//���� �ִ� ������
	public SinSang(String name, int age){
		System.out.println("String name, int age ������ ȣ��");
		this.name=name;
		this.age=age;
	}
	//����� ���� �޼��� : ����ڰ� ����� ���� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age+"\n");
	}
}//class(SinSang)-end


public class Test02_cons {
	public static void main(String[] args) {
		SinSang kim=new SinSang("ȫ�浿",20);
		kim.disp();
		//
		
		SinSang lee=new SinSang("�̼���",45);//��ü����,������ ȣ��
		lee.disp();
		//
		SinSang doo=new SinSang("���Ͽ�",6);//��ü����,������ ȣ��
		doo.disp();
	}//main-end
}//class-end
