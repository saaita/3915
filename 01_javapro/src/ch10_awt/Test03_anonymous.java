package ch10_awt;
import java.awt.*;
import java.awt.event.*;
//�̸����� Ŭ������ ����Ͽ� â����
public class Test03_anonymous extends Frame{
	//����
	//������
	public Test03_anonymous(){
		super("�̸����� Ŭ���� ����Ͽ� â����");
		setBackground(Color.yellow);
		setSize(500,500);
		setVisible(true);//âǥ��
		
		addWindowListener(new WindowAdapter(){//�̸����� Ŭ����
			//�������̵�
			public void windowClosing(WindowEvent w){
				System.exit(0);//���α׷� ����
			}
		});//�̸����� Ŭ����-end
	}//cons-end
	//�޼���
	//main
	public static void main(String[] args) {
		new Test03_anonymous();//��ü����, ������ȣ��
	}//main-end
}//class-end
