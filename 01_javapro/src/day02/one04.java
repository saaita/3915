package day02;
import java.util.Arrays;
//5개 숫자를 입력받아 배열에 넣기
import java.util.Scanner;


public class one04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력 음수는뺴고");
		int arr[] = new int[5];//{0,0,0,0,0}
		for(int i=0; i<5; i++){
			int num=s.nextInt();
			if(num>=0){
				arr[i] = num;
			}else{
				System.out.println("음수x");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		




	}//main-end
}//class-end

