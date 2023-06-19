package ch09_interface;

abstract class Animal3{
	//����
	public String sName;

	//������
	//�Ϲ� �޼���
	public void move(){
		System.out.println("��� �Ÿ���");
	}

	//�߻�޼���
	public abstract void howl();

}//class-end

//�Ļ� Ŭ����
class Dog3 extends Animal3{
	//����
	//������

	//�Ϲ� �޼��� �������̵�
	public void move(){
		System.out.println("��¦ ��¦");
	}
	//�߻�޼��� �������̵�
	public void howl(){
		System.out.println("�۸�~");
	}
}//class-end

//�Ļ�Ŭ����
class Cat3 extends Animal3{
	//����
	//������
	//�޼��� : �߻� �޼��� �������̵�
	public void howl(){
		System.out.println("�߿� �߿�~~");
	}
}//class-end
public class Test08_abstract {
	public static void main(String[] args) {
		Dog3 d=new Dog3();//��ü���� , ������ ȣ��
		Cat3 c=new Cat3();//��ü���� , ������ ȣ��

		d.move();
		d.howl();
		System.out.println();
		c.move();
		c.howl();
		
	}//main-end
}//class-end
