package day02;
import java.util.Arrays;
//5�� ���ڸ� �Է¹޾� �迭�� �ֱ�
import java.util.Scanner;


public class one04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է� ��������");
		int arr[] = new int[5];//{0,0,0,0,0}
		for(int i=0; i<5; i++){
			int num=s.nextInt();
			if(num>=0){
				arr[i] = num;
			}else{
				System.out.println("����x");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		




	}//main-end
}//class-end

