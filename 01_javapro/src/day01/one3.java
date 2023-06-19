package day01;

public class one3 {
	public static void main(String[] args) {
		int arr[] = {4,-3,5,-2,1,-8,7,-9};
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			
			if(min> arr[i]){
				min=arr[i];					
			}			
		}
		System.out.println(min);
	}//main
}//class
