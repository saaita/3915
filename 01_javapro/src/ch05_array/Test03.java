package ch05_array;
// �������� : �ڵ����� �ʱ�ȭ ��(�޼��� �ۿ��� ����� ��)
// �������� : �ڵ����� �ʱ�ȭ �ȵ�
// �迭 	 : ���������� �ڵ����� �ʱ�ȭ��
public class Test03 {
	// main()�޼��尡 static�Ǿ� �ֱ⶧����
	// main()�ȿ��� ����� ���������� static���� ���� �Ǿ� �־�� ����Ҽ� �ִ�.
	// main()�ȿ��� ��ü�����ϸ� static���� ���� ���� �ʾƵ� ��밡��
	static int a;//����(��������), static �޼��忡�� ����Ϸ���
	int c;//0 ����(��������), ��ü������ �����ؾ���
	public static void main(String[] args) {
		//int b;
		
		System.out.println(a);
		//System.out.println(b);//error
		
		int c[]=new int[3];
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}//for-end
	}//main-end
}//class-end
