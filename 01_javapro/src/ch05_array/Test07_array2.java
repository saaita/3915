package ch05_array;
//2���� �迭
public class Test07_array2 {
	public static void main(String[] args) {
		
		int a[][]={{10,20},{30,40,50}};
		//			0��		1��
		
		System.out.println("�� ����:"+a.length);
		System.out.println("�� ���� a[0].length :"+ a[0].length);//2
		System.out.println("�� ���� a[1].length :"+ a[1].length);//3
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
				//				     �� ,��
			}//inner=for
			System.out.println();
		}//out-end
	}//main-end
}//class-end
