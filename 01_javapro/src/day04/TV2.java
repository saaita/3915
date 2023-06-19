package day04;

public class TV2 {
	TV2(){
		System.out.println("ColorTV 기본생성자");
	}
	TV2(int size){
		System.out.println("ColorTV 파라미터 생성자");
	}
	private int size;

	void setSize(int size){
		this.size = size;
	}
	int getSize(){
		return size;
	}
}
class ColorTV1 extends TV2{
	private int color;
	
	void setColor(int color){
		this.color = color;
	}
	void printProperty(){
		System.out.println(getSize()+"인치"+color+"컬러");
	}
}

