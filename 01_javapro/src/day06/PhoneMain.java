package day06;

public class PhoneMain {
	public static void main(String[] args) {
		
		PhoneInterface phone;
		SamsungPhone sPhone = new SamsungPhone();
		
		phone = sPhone; // 업캐스팅
		
	}
}
