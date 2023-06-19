package day01;

public class one1 {
	public static void main(String[] args) {
		int arr[] = {5,4,8888,23,9999};
		int max=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
							}
	//°°Àºif¹®- max=Math.max(max, arr[i]);	
		}
		System.out.println(max);
		
	}//main
}//class-end
