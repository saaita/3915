package day02;
//3. 배열{40, -20, -30, -10, 50}에서 가장 큰 수와 가장 작은 단, 음수는 절대값
//(ex, 가장 큰 수 : 50, ,가장 작은 수 : -10  결과40)
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
