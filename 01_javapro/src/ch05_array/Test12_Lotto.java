package ch05_array;
//�ζ� : 1~45  6��
public class Test12_Lotto {
	public static void main(String[] args) {
		int lotto[]=new int[6];//���𵿽ÿ� ����


		//�ζǰ� �߻�
		for(int i=0; i<6; i++){
			lotto[i]=(int)(Math.random()*45+1);

			//�ߺ��� �ذ��ϱ�
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){//�������̸�, ���� �߻��� �� ��ȿȭ
					i--;
					break;//���� for�� Ż��

				}//if
			}//inner-for

		}//out-for
		//���
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}//for-end
	}//main-end
}//class-end
