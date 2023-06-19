package day05;

public class IPTV extends ColorTV{
	private String ip;
	
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	void printProperty(){
		System.out.print("���� IPTV�� " + ip + " �ּ��� ");
		super.printProperty();
	}
}
