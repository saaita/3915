package ch07_cons;
//super : 상위 클래스 객체를 뜻한다(거의 사용 안함)
//super() : 상위 클래스 생성자 호출된다(많이사용)

import java.awt.*;//Frame(윈도우 창 생성)
public class Test04_super extends Frame{
	//생성자
	public Test04_super(){
		super("연습");//상위 클래스 생성자 호출, 생성자 안에서 첫줄에 기재한다
		setBackground(Color.green);
		setSize(500,500);;//width, height 픽셀
		setVisible(true);//창 표시
	}//cons-end
	
	
	public static void main(String[] args) {
		new Test04_super();//객체생성, 생성자 호출
	}//main-end
}//class-end
