package ch10_awt;
import java.awt.*;//Frame
import java.awt.event.*;//이벤트 처리 하려고
//WindowAdapter클래스 사용하여 창종료
//inner class 사용하여 창 종료

public class Test02_window extends Frame{
	//변수
	//생성자
	public Test02_window(){
		setBackground(Color.cyan);
		
		addWindowListener(new MyWin());//이벤트 등록
		setSize(500,500);
		setVisible(true);
	}//cons-end
	
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent w){
			System.exit(0);//프로그램 종료
		}
	}//inner class-end
	//메서드
	public static void main(String[] args) {
		new Test02_window();//객체생성, 생성자 호출
	}
	//main
}//class-end
