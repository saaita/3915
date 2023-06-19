package ch10_awt;
import java.awt.*;
import java.awt.event.*;
//inner class 사용하여 창종료

public class Test05_event extends Frame implements ActionListener{
	//변수
	TextField tf1,tf2;
	TextArea ta;
	//생성자
	public Test05_event(){
		super("대화창");//첫 줄에 기재, 상위 클래스 생성자 호출
		
		tf1=new TextField();
		tf2=new TextField();
		ta=new TextArea();
		
		tf1.setBackground(Color.yellow);
		tf2.setBackground(Color.green);
		
		tf1.setFont(new Font("Dialog",Font.BOLD,20));
		tf2.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setFont(new Font("Dialog",Font.BOLD,20));
		
		//Frame 컨테이너에 컴포넌트 붙이기
		this.add(tf1,"North");//위쪽
		add(tf2,"South");
		add(ta,"Center");
		
		this.addWindowListener(new MyWin());//이벤트등록
		tf1.addActionListener(this);//이벤트등록
		tf2.addActionListener(this);// -
		
		
		setSize(500,500);
		setVisible(true);
	}//cons-end
	//inner class
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class - end
	//메서드 : 오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="홍길동 말>>"+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText("");//내가 썻던 입력칸 내용지우기
			tf2.requestFocus();//tf2포커스이동
			
		}else if(e.getSource()==tf2){
			String msg="임영웅 말>>"+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText("");//내가 썻던 입력칸 내용지우기
			tf1.requestFocus();//tf1포커스이동
			
		}
	}//actionPerform()-end
	//main
	public static void main(String[] args) {
		new Test05_event();
	}//main-end
}//class-end
