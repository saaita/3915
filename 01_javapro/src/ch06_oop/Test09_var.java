package ch06_oop;
//�������� : Ŭ�����ȿ�, �޼���ۿ� ����. �ڵ��ʱ�ȭ �ȴ�
class SinSang{
	String name;//��������
	int age;

	//�޼���

	public void setData(String name,int age){
		this.name=name;//this.��������=�Ű�����
		this.age=age;
	}//setDate()-end

	//��� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}//disp()-end
}//class-end
public class Test09_var {
	public static void main(String[] args) {
		
		SinSang ss=new SinSang();//��ü����,heap�����޸� �Ҵ�
		ss.setData("������",30);
		ss.disp();
		//
		ss.setData("�ڹ���",45);
		ss.disp();


	}//main-end
}//class-end
