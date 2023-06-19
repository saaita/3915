package ch05_array;
//int a[] : 차원 배열
//int a[][] : 2차원 배열
//     행,열
//int a[][][] : 3차원 배열
//     면,행,열
//3차원 배열
//결과출력
//	abc
//	def
//
//	ghi
//	jkl
public class Test10 {
	public static void main(String[] args) {
		char ch[][][]={
				{{'a','b','c'},{'d','e','f'}},
				{{'g','h','i'},{'j','k','l'}}
				
		};
		
		for(int i=0; i<2; i++){//면
			for(int j=0; j<2; j++){//행
				for(int k=0; k<3; k++){//열
					System.out.print(ch[i][j][k]);
					//                  면,행,열
				}//inner-for
				System.out.println();//줄바꿈,행구분
			}//middle-for
			System.out.println();//줄바꿈,면구분
		}//out-for
		
	}//main-end
}//class-end
