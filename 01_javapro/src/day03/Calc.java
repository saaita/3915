package day03;

public class Calc {
	 void sum(){//void는 리턴문이 필요가 없다.
		 System.out.println("void sum 호출");
	 }
	 
	 double sum2(double a, double b){
		 return a+b;
	
	 }
	int arrMax(int[] arr){
		int max = arr[0];
		for(int num : arr){
		max = Math.max(max, num);
	
	}
	 
	 return max;
	
	 
 }
	double arrAvg(int[] arr){
		int sum =0;
		for(int num : arr){
			sum+=num;
		}
		return (double)sum/arr.length;
	}
	
	void test1(int a){
		a = a+1;
	}
	
	void test2(int[] arr){
		arr[0] = 100;
	}
		
	
	 
	 /*int max=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];z8/
	 
	 
	 
		 
		 //int sum2(int a, int b){//int는 리턴이 필요
			//int c = a+b; 
			// return c;
			 
			 /* if(a>b){
				 return a; 
			 }else{
				 return b;
			 }*/
			 
			// return(a>=b)? a:b;
		 
		 //int abs(int a){
			 
			 
			// return(a>=0)? a:-a;
		
		 

}//class-end
