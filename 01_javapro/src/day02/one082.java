package day02;



public class one082 {
	public static void main(String[] args) {

		int arr[] = {15, 22, 33, 50, 19, 2};
		int sum=0;//¦��
		int sum2=0;//Ȧ��
		int count=0;
		int count1=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				sum += arr[i];
				count++;
			}else{
				sum2 += arr[i];
				count1++;
			}
		}//for end
		System.out.println("Ȧ��:"+(double)sum2/count1+"\n"
						  +"¦��:"+(double)sum/count);
	}//main-end
}//class-end
