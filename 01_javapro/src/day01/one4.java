package day01;

public class one4 {
	public static void main(String[] args) {
		
		int arr[] = {4,-3,5,-2,1,-8,7,-9};
		int sum=0;
		
		for (int i=0; i<arr.length; i++){
			//sum += Math.abs(arr[i]);
			if(arr[i]<0){
				sum += -arr[i];
			}else{
				sum += arr[i];
			}
		}
		System.out.println(sum);
		//모든숫자의 합
		
	}//main-end
}//class-end
