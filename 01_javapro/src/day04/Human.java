package day04;

public class Human {
	private String name;
	private String address;
	private String phone;
	private int age;

	Human(String name){
		this.name = name;
		this.address = "�˼�����";
		this.phone = "�˼�����";
	}
	
	Human(String name, String address){
		this.name = name;
		this.address = address;
		this.phone = "�˼�����";
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
		return "�̸��� "+name+ ", �ּҴ�"+address+", �ڵ�����ȣ��"+phone+"�Դϴ�";
	}
}


