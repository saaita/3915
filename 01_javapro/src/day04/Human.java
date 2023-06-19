package day04;

public class Human {
	private String name;
	private String address;
	private String phone;
	private int age;

	Human(String name){
		this.name = name;
		this.address = "알수없음";
		this.phone = "알수없음";
	}
	
	Human(String name, String address){
		this.name = name;
		this.address = address;
		this.phone = "알수없음";
	}
	Human(String name, String address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	Human(String name, String address, String phone , int age){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	
	}
	public String toString(){
		return "이름은 "+name+ ", 주소는"+address+", 핸드폰번호는"+phone+"입니다";
	}
}


