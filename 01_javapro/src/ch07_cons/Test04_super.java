package ch07_cons;
//super : ���� Ŭ���� ��ü�� ���Ѵ�(���� ��� ����)
//super() : ���� Ŭ���� ������ ȣ��ȴ�(���̻��)

import java.awt.*;//Frame(������ â ����)
public class Test04_super extends Frame{
	//������
	public Test04_super(){
		super("����");//���� Ŭ���� ������ ȣ��, ������ �ȿ��� ù�ٿ� �����Ѵ�
		setBackground(Color.green);
		setSize(500,500);;//width, height �ȼ�
		setVisible(true);//â ǥ��
	}//cons-end
	
	
	public static void main(String[] args) {
		new Test04_super();//��ü����, ������ ȣ��
	}//main-end
}//class-end
