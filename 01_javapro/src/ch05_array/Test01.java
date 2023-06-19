package ch05_array;

public class Test01 {
	public static void main(String[] args) {
		int a=10;//변수(단독 주택에 비유)
		int b=20;//
		int c=30;//
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		//
		int d[]=new int[3];//배열(아파트 비유)
		 d[0]=10;
		 d[1]=20;
		 d[2]=30;
	
		 System.out.println(d[0]);
		 System.out.println(d[1]);
		 System.out.println(d[2]);
		 System.out.println();
		 //
		 //for
		 for(int i=0; i<3; i++){
			 System.out.println(d[i]);// i= 0,1,2
		 }//for-end
		 System.out.println();
		 //
		 int e[]={50,60,70};
		 for(int i=0; i<3; i++){
			 System.out.println(e[i]);
		 }
		 
		 
	}//main-end
}//class-end
