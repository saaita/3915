package ch01;

public class Test03 {
	public static void main(String args[]){
		// \n : �ٹٲ�
		// \r : carrage return : Ŀ���� ���� ������ ù��°�� �̵� �ϴ°�
		
		System.out.println("aaa\nbbb\nccc"); // \n
		System.out.println("aaa\rbbb\rccc"); // \r
		//���� ����
		
		// cmd â���� ����
		//C:\java_test\work\01_javapro\bin>java ch01.Test03
		//aaa
		//bbb
		//ccc
		//ccc
		
		//\t : ���� ĭ �ٿ��(8ĭ)
		System.out.println("�̼���\t90\t80");
		System.out.println("�ӿ���\t100\t70");
		System.out.println("ȫ�浿\t70\t70");
		
		//cmd â���� ����
		//C:\java_test\work\01_javapro\bin>javac ch01.Test03.java
	}//main-end
}//class-end
