package ch03_oper;
//산술연산자 +덧셈 -뺄셈 *곱하기 /나누기 %나머지
//정수/정수=몫 메일page계산, 게시판page계산
//실수/정수=실수(자료형이 큰쪽으로 자동 형변환 된다)
// %(나머지)
public class Test01 {
	public static void main(String[] args) {
		int a=10,b=7;
		int s1=a+b;
		int s2=a-b;
		int s3=a*b;
		int s4=a/b;//몫
		int s5=a%b;//나머지
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		//
		int pageCount=37;
		System.out.println(pageCount/10);
		System.out.println(pageCount%10);
		
		System.out.println("페이지수:"+((pageCount/10)+((pageCount%10==0)?0:1)));
		//
		// 자동 형변환
		double x=37.0;
		System.out.println(x/10);
		System.out.println(37.0/10);
	}//main-end
}//class-end
