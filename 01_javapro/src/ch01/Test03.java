package ch01;

public class Test03 {
	public static void main(String args[]){
		// \n : 줄바꿈
		// \r : carrage return : 커서가 현재 라인의 첫번째로 이동 하는것
		
		System.out.println("aaa\nbbb\nccc"); // \n
		System.out.println("aaa\rbbb\rccc"); // \r
		//저장 실행
		
		// cmd 창에서 실행
		//C:\java_test\work\01_javapro\bin>java ch01.Test03
		//aaa
		//bbb
		//ccc
		//ccc
		
		//\t : 일정 칸 뛰운다(8칸)
		System.out.println("이순신\t90\t80");
		System.out.println("임영웅\t100\t70");
		System.out.println("홍길동\t70\t70");
		
		//cmd 창에서 실행
		//C:\java_test\work\01_javapro\bin>javac ch01.Test03.java
	}//main-end
}//class-end
