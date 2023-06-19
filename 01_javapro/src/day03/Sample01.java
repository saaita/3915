package day03;

import java.util.Arrays;

public class Sample01 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum();
		int a = 10;
		calc.test1(a);
		int arr[] = {3,5,2,1,8};
		calc.test2(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(a);
		
		
		
		//int max = arr[0];
		//for(int num : arr){
		//	max = Math.max(max, num);
		//}
		
		
		

		
		
	}//main-end
	
}//class-end
