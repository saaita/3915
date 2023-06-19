package ch08_class;
//수퍼클래스
class Person77{
	//전역변수
	protected String name;
	protected int age;
	protected double height;
	
	//디폴트 생성자
	public Person77(){}
	
	//인자 있는 생성자
	public Person77(String name,int age,double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}//cons-end
		
	//사용자 정의 메서드
	public void eat(){
		System.out.println(name+"은 된장찌개를 먹는다");
	}//eat-end
	
	public void sleep(){
		System.out.println(name+"은 집에서 8시간 잔다");
	}//sleep-end
	
}//class-end========================================
//파생클래스
class Child extends Person77{
	//전역변수
	private String grade;
	//인자 있는 생성자
	public Child(String name,int age,double height, String grade){
		super(name,age,height);//상위클래스 생성자 호출
		this.grade=grade;
	}
	
	//메서드
	public void study(){
		System.out.println(name+"학생은"+grade+"이다");
	}
}//class-end =================
//파생클래스
class Adult extends Person77{
	//전역변수
	private String job;
	//인자 있는 생성자
	public Adult(String name,int age,double height,String job){
		super(name,age,height);
		this.job=job;
	}//cons-end
	//사용자 정의 메서드
	public void work(){
		System.out.println("직업은"+job+"입니다");
	}//cons-end
}//class-end
//주 클래스
public class Test10_extends {
	public static void main(String[] args) {
		//관계없는 클래스 에서는 객체 생성하여 사용한다.
		//상위 클래스변수로 하위개체 처리
		Person77 p=new Person77("kim",35,180);
		p.eat();
		p.sleep();
		System.out.println();
		//
		//상위 클래스 변수로 하위 객체 처리
		p=new Child("임도형",11,145.5,"4학년");
		//p.study();//에러
		((Child)p).study();
		System.out.println();
		//
		//상위 클래스변수로 하위 객ㅊ체 처리
		p=new Adult("임영웅",34,182.0,"가수");//객체생성,생성자 호출
		p.eat();
		p.sleep();
		((Adult)p).work();
	}//main-end
}//class-end
