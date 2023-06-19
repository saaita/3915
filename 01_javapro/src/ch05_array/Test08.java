package ch05_array;
//2차원 배열
public class Test08 {
	public static void main(String[] args) {
		
		double ki[][]={
				{160.5, 175.5},
				{163.7, 178.8}
		};
		
		for(int i=0; i<ki.length; i++){//행
			for(int j=0; j<ki[i].length; j++){//열
				System.out.print(ki[i][j]+" ");
				//                  행,열
				//                  줄,칸
				//                  row cloumn
			}//inner-for
			System.out.println();
		}//for-end
	}//main-end
}//class-end
