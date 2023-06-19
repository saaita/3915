package day01;
import java.util.Arrays;
public class onr7 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		int minIndex=0;
		
		
		for(int i=1; i<arr.length; i++){
			if(arr[minIndex] > arr[i]){
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
				
		
	}//main

}//class
