package ch05_array;
//Math
//�ֻ��� ���ü� �ִ� ������ :6
//int a=(int)(Math.random()*6+1)
//int a=(int)(Math.random()*������+���ü��ִ� ����������)
//int a=(int)(Math.random()*(ū��-������)+1)

//Math.random() : 0<x<1 �� �� �߻�, 1970�� 1�� 1�� 0�� 0�� 0�� �������� �߻�
//���� �߻� �˻�

//10~100������ �� ���ϱ�

public class Test11_Math {
	public static void main(String[] args) {
		//�ֻ����� 10���߻�
		for(int i=1; i<=10; i++){
			int a=(int)(Math.random()*6+1);
			System.out.println(a+" ");
		}//for-end
		//����
		System.out.println();
		//������ ���� ���
		for(int i=1; i<=10; i++){
			System.out.println(Math.random());
		}//for-end
		System.out.println();
		//
		//10~100 ������ �� ���ϱ�
		for(int i=1; i<=10; i++){
			int a=(int)(Math.random()*(100-10+1)+10);
			System.out.print(a+" ");
		}//for-end
		
		
	}//main-end
}//class-end
