package day04;

public class TV2 {
	TV2(){
		System.out.println("ColorTV �⺻������");
	}
	TV2(int size){
		System.out.println("ColorTV �Ķ���� ������");
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
		System.out.println(getSize()+"��ġ"+color+"�÷�");
	}
}

