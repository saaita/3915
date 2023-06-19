package ch10_awt;
import java.awt.*;//Frame
import java.awt.event.*;

public class Test04_img extends Frame {
	//����
	Image img;
	
	//������
	public Test04_img(){
		img=Toolkit.getDefaultToolkit().getImage("c:\\imgs\\����.jpg");
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new MyWin());//�̺�Ʈ���
	}//cons-end
	
	//inner class-start
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class-end	
	
	//�޼��� paint(Graphics g)
	public void paint(Graphics g){
		g.drawImage(img, 30,50,this);//���� ��ġ�� x=30,y=50
		g.drawImage(img, 30,50,300,300,this);
	}
	//main
	public static void main(String[] args) {
		new Test04_img();
	}//main-end

}//class-end
