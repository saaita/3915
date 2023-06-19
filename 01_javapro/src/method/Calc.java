package method;

public class Calc {

	public void message(){
		System.out.println("안녕하세요");
	}
	String message2(){
		return "안녕하세요2";
	}
	void sum(int a,int b){
		System.out.println(a+b);
	}
	int sum2(int a,int b){
		return a+b;
	}
	double sum2(int a,double b){
		return a+b;
	}
	void max(int b,int a){
		int c = (a>=b) ? a:b ;
		System.out.println("큰 수는"+c+"입니다.");
	}
	void arr1(int arr[]){
		int maxIndex = 0;
		int minIndex = 0;

		for(int i=1; i<arr.length; i++){
			if(arr[i] > arr[maxIndex]){
				maxIndex = i;
			}if(arr[minIndex] > arr[i]){
				minIndex = i;
			}
		}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println("maxindex : "+maxIndex);
		System.out.println("minindex : "+minIndex);
		System.out.println();
		System.out.println();
	}//{3, 2, 6, 5, 4}원
	//[3, 6, 2, 5, 4]
	
	
	void arr2(int arr[]){
		int minIndex = 0;
		
		for(int i=1; i<arr.length; i++){
			if(arr[minIndex]>arr[i]){
				minIndex = i;
			}
		}
			int temp = arr[arr.length-1];
			arr[arr.length-1]=arr[minIndex];
			arr[minIndex]=temp;
			
		
		
		
		
	}


}






