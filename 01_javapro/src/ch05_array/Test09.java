package ch05_array;
//a 70,80,90 =>240
//b 80,90,100=>270
//c 77,88,99 =>264
public class Test09 {
	public static void main(String[] args) {
		int score[][]={
				{70,80,90},
				{80,90,100},
				{77,88,99}
		};
		
		int sum=0;
		
		for(int i=0; i<score.length; i++){//За
			for(int j=0; j<score[i].length; j++){//ї­
				System.out.print(score[i][j]+" ");
				sum+=score[i][j];
			
			}//inner for
			System.out.println(sum);
			sum=0;
		
		}//out-end
	}//main-end
}//class-end
