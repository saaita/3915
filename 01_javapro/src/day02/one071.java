package day02;
import java.util.Scanner;
import java.util.Arrays;
//1. 6���� ���ڸ� �Է¹޾� �迭�� �����ϰ� ���ڿ� ���������� �����Ͽ� Ȧ���� ��� ������ �ٲ��ش�.


public class one071 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("6���� �����Է�");
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
