package ch07_cons;
//this() : �ڽ��� Ŭ���� ���� ������ ȣ��
//this(�μ�) : �ڽ��� Ŭ���� ���� ������ ȣ��
class Cons{
	//��������
	String title;
	int num;
	
	//����Ʈ ������
	public Cons(){}
	
	//�����ִ� ������
	public Cons(String title){
		this(title,200);// �ڽ��� Ŭ���� ���� ������ ȣ��
	}
	//���� �ִ� ������
	public Cons(String title,int num){
		this.title=title;
		this.num=num;
		
		System.out.println("title:"+title);
		//System.out.println("title"+this.title);
		System.out.println("num:"+num);
	}
	
	
}//Cons-class-end
public class Test03_this {
	public static void main(String[] args) {
		Cons cons=new Cons("����");//��ü����, ������ ȣ��
		
		
	}//main-end
}//class-end
