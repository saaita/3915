package ch03_oper;
// �Ϲݳ������� : && || !
// ���迬���ڴ� ������ ���� ���� ����ȴ�
// ���迬���ڰ� �켱������ ����, �����꺸��
public class Test04 {
	public static void main(String args[]){
		int a=7, b=5;
		System.out.println(a>b && a>3);//t
		System.out.println(a>b && a>10);//f
		//
		System.out.println(a>b || a>10);//t
		System.out.println(a<b || a>10);//f
		//
		boolean c=true;
		System.out.println(!c);//f
		System.out.println(!!c);//t
		
		
	}//main-end
}//class-end
