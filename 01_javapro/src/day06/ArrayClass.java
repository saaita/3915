package day06;

public class ArrayClass implements ArrayInterface{


	@Override
	public int MaxSubMin(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		int min = a[0];
		for(int i=0; i<a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		// max = Math.max(max, a[i]);
			min= Math.min(min, a[i]);
		}
		
		return max-min;
	}
	public int MaxChange(int[] a) {
		int maxIndex = 0;
		for(int i=1; i<a.length; i++){
			if(a[maxIndex]< a[i]){
				maxIndex = i;
			}
		}
		int temp = a[maxIndex];
		a[maxIndex]= a[a.length-1];
		return a[a.length-1]=temp;
	}
}
