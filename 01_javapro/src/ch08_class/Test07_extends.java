package ch08_class;
import java.awt.*;//frame
//���� Ŭ���� ������ ���� ��ü ó��
public class Test07_extends extends Frame {
	//����
	
	//������
	public Test07_extends(){
		super("��� ����");//����Ŭ���� ������ ȣ��
		setBackground(Color.cyan);
	}//cons-end
	//�޼���
	public static void main(String[] args) {
		Frame f=new Test07_extends();//��ü����, ������ȣ��
		f.setSize(500, 500);
		f.setVisible(true);
	}//main-end
}//class-end
