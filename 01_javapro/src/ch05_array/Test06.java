package ch05_array;

public class Test06 {
	public static void main(String[] args) {
		int a[]={10,20,30};
		int b[];//¼±¾ð
		b=a;//a=10
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"--"+b[i]);
		
		}//for-end
	}//main-end
}//class-end
