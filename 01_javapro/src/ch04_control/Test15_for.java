package ch04_control;

public class Test15_for {
	public static void main(String[] args) {

		//巩力

		//####*
		//###***
		//##*****
		//#*******

		for(int i=1; i<=4; i++){
			for(int j=1; j<=(5-i); j++){
				System.out.print(" ");

			}//inner-for
			for(int k=1; k<=(i*2-1); k++){
				System.out.print("*");
			}//inner=for
			System.out.println();
		}//out-for

		//巩力 : 备备窜
		for(int i=2; i<=9; i++){
			System.out.print(i+"窜"+" ");
			System.out.println();

			for(int j=1; j<=9; j++){
				System.out.println(i+"X"+j+"="+i*j);
			}//ineer-for
			System.out.println();
		}//out-for
		
	}//main-end
}//class-end
