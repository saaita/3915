package day04;

public class TV {
	private String name;
	private int year;
	private int size;
	
	TV(String name, int year, int size){
		this.name = name;
		this.year = year;
		this.size = size;
	}
	
	void show(){
		System.out.println(name+"에서만든"+year+"년"+size+"인치");
	}
}
