package ch07_cons;
//����Ŭ����
class SuperTest{
	//��������
	String title;
	int num;

	//����Ʈ ������
	public SuperTest(){}
	//�����ִ� ������
	public SuperTest(String title, int num){
		this.title=title;
		this.num=num;

	}//cons-end

	//����� ���� �޼���
	public void disp(){
		System.out.println("title:"+title);
		System.out.println("num:"+num);
	}//disp()-end
	
}//class-SuperTest-end

//���� Ŭ����=�Ļ� Ŭ����
class SubTest extends SuperTest{
	//����Ʈ ������
	public SubTest(){
		super("����",100);//���� Ŭ���� ������ ȣ��
	}//cons-end
}//class-SubTest-end

public class Test05_super {
	public static void main(String[] args) {
		SubTest sub=new SubTest();//��ü����, ������ ȣ��
		sub.disp(); 


	}//main-end

}//class-end
