package ch05_array;
//int a[] : ���� �迭
//int a[][] : 2���� �迭
//     ��,��
//int a[][][] : 3���� �迭
//     ��,��,��
//3���� �迭
//������
//	abc
//	def
//
//	ghi
//	jkl
public class Test10 {
	public static void main(String[] args) {
		char ch[][][]={
				{{'a','b','c'},{'d','e','f'}},
				{{'g','h','i'},{'j','k','l'}}
				
		};
		
		for(int i=0; i<2; i++){//��
			for(int j=0; j<2; j++){//��
				for(int k=0; k<3; k++){//��
					System.out.print(ch[i][j][k]);
					//                  ��,��,��
				}//inner-for
				System.out.println();//�ٹٲ�,�౸��
			}//middle-for
			System.out.println();//�ٹٲ�,�鱸��
		}//out-for
		
	}//main-end
}//class-end
