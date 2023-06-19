package ch05_array;
//전역변수 : 자동으로 초기화 됨(메서드 밖에서 선언된 것)
//지역변수 : 자동으로 초기화 안됨
//배열 	 : 지역일지라도 자동으로 초기화됨
public class Test04 {
	public static void main(String[] args) {
		
		int a[]=new int[3]; //0
		double b[]=new double[3]; //0.0
		char c[]=new char[3]; // 공백
		String d[]=new String[3]; // null = ""
		
		for(int i=0; i<3; i++){
			System.out.println(a[i]+"--"+b[i]+"--"+c[i]+"--"+d[i]);
		}//for-end
	}//main-end
}//class-end
