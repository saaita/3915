package ch10_awt;
import java.awt.*;
import java.awt.event.*;
//이름없는 클래스를 사용하여 창종료
public class Test03_anonymous extends Frame{
	//변수
	//생성자
	public Test03_anonymous(){
		super("이름없는 클래스 사용하여 창종료");
		setBackground(Color.yellow);
		setSize(500,500);
		setVisible(true);//창표시
		
		addWindowListener(new WindowAdapter(){//이름없는 클래스
			//오버라이딩
			public void windowClosing(WindowEvent w){
				System.exit(0);//프로그램 종료
			}
		});//이름없는 클래스-end
	}//cons-end
	//메서드
	//main
	public static void main(String[] args) {
		new Test03_anonymous();//객체생성, 생성자호출
	}//main-end
}//class-end
