package ch05_array;
// 전역변수 : 자동으로 초기화 됨(메서드 밖에서 선언된 것)
// 지역변수 : 자동으로 초기화 안됨
// 배열 	 : 지역일지라도 자동으로 초기화됨
public class Test03 {
	// main()메서드가 static되어 있기때문에
	// main()안에서 사용할 전역변수는 static으로 선언 되어 있어야 사용할수 있다.
	// main()안에서 객체생성하면 static으로 선언 하지 않아도 사용가능
	static int a;//선언(전역변수), static 메서드에서 사용하려고
	int c;//0 선언(전역변수), 객체생성을 따로해야함
	public static void main(String[] args) {
		//int b;
		
		System.out.println(a);
		//System.out.println(b);//error
		
		int c[]=new int[3];
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}//for-end
	}//main-end
}//class-end
