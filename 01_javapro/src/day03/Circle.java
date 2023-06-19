package day03;

public class Circle {
	int radius;
	String name;
	
	Circle(){
		System.out.println("기본생성자");
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	Circle(int a, String b){
		System.out.println("매개변수 생성자");
		radius = a;
		name = b;
	}
	public static void main(String[] args) {
	
		
		
	}//main-end
}//class-end
