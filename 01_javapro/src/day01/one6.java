package day01;

import java.util.Arrays;

public class one6 {
	public static void main(String[] args) {
		int arr[] = {7, 6, 9, 3, 5};
		int maxIndex=0;	//2
		int minIndex=0;
		for(int i=1; i<arr.length; i++){
			if(arr[maxIndex] < arr[i]){
			maxIndex = i;
			
			}if(arr[minIndex] > arr[i]){
				minIndex = i;
				
				}
							
		}
		int temp=arr[maxIndex];//temp 9
		arr[maxIndex]=arr[minIndex];
		arr[minIndex]=temp;
		
	System.out.println(Arrays.toString(arr));
	
		
	}//main
}//class
