package day02;
import java.util.Scanner;
import java.util.Arrays;
//1. 6개의 숫자를 입력받아 배열에 저장하고 숫자에 순차적으로 접근하여 홀수일 경우 음수로 바꿔준다.


public class one071 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("6개의 숫자입력");
		int arr [] = new int[6] ;
		for(int i=0; i<arr.length; i++){
			int sum = 0;
			int num=s.nextInt();
			
			if(num%2==0){
				arr[i] = num;
			}else{
				arr[i]=-num;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}//main-end
}//class-end
