package day02;
//3. �迭{40, -20, -30, -10, 50}���� ���� ū ���� ���� ���� ��, ������ ���밪
//(ex, ���� ū �� : 50, ,���� ���� �� : -10  ���40)
import java.util.Arrays;
public class one093a {
	public static void main(String[] args) {
		int arr[] = {40,20,30,10,50};
		int max = Math.abs(arr[0]);
		int min = Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++){
			max = Math.max(max, Math.abs(arr[i]));
			min = Math.min(min, Math.abs(arr[i]));
		}
		
		System.out.println(max / min);
		
		
	}//main-end
}//class-end
