package ch06_oop;
//메서드 예제
public class Test07_method {
	public void star(){

		for(int i=1; i<=4; i++){//행
			for(int j=1; j<=(5-i); j++){//열
				System.out.print(" ");
			}//inner-for
			for(int k=1; k<=(i*2-1); k++){//열
				System.out.print("*");
			}//inner-for

			System.out.println();//줄바꿈
		}//out-for
	}//star()-end

	public static void main(String[] args) {
		
		Test07_method test07=new Test07_method();//객체생성 heap영역 메모리할당
		test07.star();
	}//main-end

}//class-end
