package day02;
//�迭 {10,-20,30,40,50}�� ������ ������ ��� �� ���ϱ�
public class one03 {
	public static void main(String[] args) {
		int arr[] = {10,-20,30,40,50};
		int sum=0;
		int count=0;
		for(int num : arr){
			if(num>= 0){
				sum+=num;
				count++;
			}	
//		for(int i=0; i<arr.length; i++){
//			if(arr[i]>0){
//			sum += arr[i];
//			count++;
//			}
		}
		System.out.println((double)sum/count);
	}//main-end
}//class-end
