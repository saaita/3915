package ch03_oper;
// == : �⺻ �ڷ��� ���� �� ���
// equals() : ���ڿ� ��(��,�ҹ��� �����Ͽ� ��)
// equalsIgnoreCase() : ���ڿ� ��(��,�ҹ��� ���� �ʰ� ��)

// ��ü instanceof Ŭ���� : ��ü��
public class Test09 {
	public static void main(String args[]){
		
		
		//�⺻�ڷ��� : boolean, byte,short,int,long,double
		//�⺻ �ڷ��� ��
		int a=10, b=10;
		if(a==b){
			System.out.println("a==b");
		}else{
			System.out.println("a|!=b");
		}
		//=============
		//equals()
		//equalsIgnoreCase()
		String str1="hello";
		String str2="hello";
		String str3="Hello";
		
		System.out.println(str1.equals(str2));//t
		System.out.println(str1.equals(str3));//f (��ҹ��� ���ж���)
		System.out.println(str1.equalsIgnoreCase(str3));//t(��ҹ��� ����x)
		
		//��ü instanceof Ŭ����
		String str=new String("aaa");//��ü����
		Object ob=new Object();//��ü����
		
		System.out.println(str instanceof String);//t
		System.out.println(str instanceof Object);//t
		System.out.println(ob instanceof Object);//t
		System.out.println(ob instanceof String);//f
		System.out.println();//�ٹٲ�
		
		
		
	}//main-end
}//class-end
