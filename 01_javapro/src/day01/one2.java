package day01;

public class one2 {
	public static void main(String[] args) {
		int arr[] = {4,3,5,2,1};
		
		int min=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>min){
				min=arr[i];
			}
		}
		
		System.out.println(min);
		
		
	}//main-end
}//class-end
