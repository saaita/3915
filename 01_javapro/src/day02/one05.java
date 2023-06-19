package day02;
//선택 정렬 완성하기
import java.util.Arrays;

public class one05 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5}; 
		for(int i=0; i<arr.length; i++){
			int index = i; 
			for(int j=i+1; j<arr.length; j++){ 
				if(arr[index] > arr[j]){
					index = j; 
				}//if-end
			}//for-end
			int temp = arr[index]; 
			arr[index] = arr[i];
			arr[i] = temp;
		//순서  System.out.println(Arrays.toString(arr));
		}//for-end
		System.out.println(Arrays.toString(arr));
	}//main-end
}//class-end
