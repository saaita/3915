package ch08_class;
import java.awt.*;//frame
//상위 클래스 변수로 하위 객체 처리
public class Test07_extends extends Frame {
	//변수
	
	//생성자
	public Test07_extends(){
		super("상속 연습");//상위클래스 생성자 호출
		setBackground(Color.cyan);
	}//cons-end
	//메서드
	public static void main(String[] args) {
		Frame f=new Test07_extends();//객체생성, 생성자호출
		f.setSize(500, 500);
		f.setVisible(true);
	}//main-end
}//class-end
