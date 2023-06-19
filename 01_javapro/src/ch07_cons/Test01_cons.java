package ch07_cons;
// 생성자 실습
// 디폴트 생성자는 생성자를 넣지 않을때 자동으로 만들어진다
// 인자 있는 생성자가 있으면 / 디폴트 생성자는 자동으로 안만들어진다
// 생성자는 인수를 갖으면 오버로드 가능하다
class Sungjuk{
	//전역변수
	String name;
	int kor;
	
	//인자 없는 디폴트 생성자
	public Sungjuk(){
		//this.name="";
		//this.kor=0;
		System.out.println("디폴트 생성자 호출");
	}//Sungjuk()-end
	
	//인자 있는 생성자
	public Sungjuk(String name){
		this.name=name;
		//this.kor=0; //전역변수 : 자동초기화 되기 떄문
		System.out.println("String name 인자 있는 생성자 호출");
		System.out.println("name:"+name);
	}
	
	//인자 있는 생성자
	public Sungjuk(String name,int kor){
		this.name=name;
		this.kor=kor;
		System.out.println("String name, int kor 인자 있는 생성자 호출");
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
	}
	
}//class-Sungjuk-end
public class Test01_cons {
	public static void main(String[] args) {
		new Sungjuk();//객체생성, 생성자 호출
		new Sungjuk("kim");//객체생성, 생성자 호출
		new Sungjuk("lee",90);//객체생성, 생성자 호출
	}//main-end
	
}//class-end
