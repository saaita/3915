package day05;

public class ColorTV extends TV{
	private int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	
	void printProperty(){
		System.out.println(getSize() + "��ġ " + color + "�÷�");
	}
}
