package ch10_awt;
import java.awt.*;//Frame
import java.awt.event.*;//�̺�Ʈ ó�� �Ϸ���
//WindowAdapterŬ���� ����Ͽ� â����
//inner class ����Ͽ� â ����

public class Test02_window extends Frame{
	//����
	//������
	public Test02_window(){
		setBackground(Color.cyan);
		
		addWindowListener(new MyWin());//�̺�Ʈ ���
		setSize(500,500);
		setVisible(true);
	}//cons-end
	
	class MyWin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent w){
			System.exit(0);//���α׷� ����
		}
	}//inner class-end
	//�޼���
	public static void main(String[] args) {
		new Test02_window();//��ü����, ������ ȣ��
	}
	//main
}//class-end