package day06;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void senCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}


}
