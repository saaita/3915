package day04;

public class Test03 {
	public static void main(String[] args) {

		
			Human hong = new Human("홍길동");
			Human yu = new Human("유재석","인천");
			Human kang = new Human("강호동","서울","010-1234-5678");
			Human park = new Human("박명수","부산","010-9876-4321");
			
			System.out.println(hong.toString());
			System.out.println(yu.toString());
			System.out.println(kang.toString());
			System.out.println(park.toString());
	}
}
