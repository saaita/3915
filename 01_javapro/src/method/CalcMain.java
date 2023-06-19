package method;

import java.util.Arrays;
import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.message();
		//"안녕하세요" 문구 출력
		System.out.println(calc.message2());
		
		calc.sum(1,2);
		
		int a= calc.sum2(3,4);
		System.out.println(a);
		//7출력
		double b = calc.sum2(1, 2.5);
		System.out.println(b);
		//3.5
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자입력");
//		int c = s.nextInt();
//		int d = s.nextInt();
//		calc.max(c, d);
//		s.close();
		
		int arr[]= {3, 2, 6, 5, 4};
		//calc.arr1(arr);
		//System.out.println(Arrays.toString(arr));
		//[3, 6, 2, 5, 4]
		//가장 작은 숫자와 가장 큰 숫자의 위치 바꾸기
		
		calc.arr2(arr);
		//가장작은숫자 값,마지막배열값 위치바꾸기
		System.out.println(Arrays.toString(arr));
		//3,4,6,5,2
		
	
	}
}
