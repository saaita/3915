package test;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		int arr[] = {3, 5, 2, 9, 8};
		int max = Math.abs(arr[0]);

		for(int i=0; i<arr.length; i++){
			max = Math.max(max, Math.abs(arr[i]));
		
		}
		int temp = arr[0];
		arr[0] = max;
		max = temp;
		
		System.out.println(Arrays.toString(arr));
	}//main-end
}//class-end

