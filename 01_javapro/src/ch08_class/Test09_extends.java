package ch08_class;
//����Ŭ����
class PersonSuper{
	//����
	protected String name;
	//����Ʈ������
	public PersonSuper(){}

	//���� �ִ� ������
	public PersonSuper(String name){
		this.name=name;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println(name);
	}//disp()-end
}//class-end
//�Ļ�Ŭ����
class PersonSub extends PersonSuper{
	//��������
	private double left_eyes;
	private double right_eyes;

	//����Ʈ������
	public PersonSub(){}

	//���� �ִ� ������
	public PersonSub(String name,double left_eyes,double right_eyes){
		super(name);//����Ŭ���� ������ ȣ��
		this.left_eyes=left_eyes;
		this.right_eyes=right_eyes;
	}
	//�޼���:����������
	public void disp(){
		System.out.println("�̸� : "+name);
		System.out.println("���ʽ÷� : "+left_eyes);
		System.out.println("�����ʽ÷� : "+right_eyes);
		System.out.println();//�ٹٲ�
	}//disp()-end
}//class-end
//�Ļ�Ŭ����
class PersonSinsang extends PersonSuper{
	//��������
	private String addr;
	private String tel;
	//����Ʈ ������
	public PersonSinsang(){}

	//�����ִ� ������
	public PersonSinsang(String name,String addr, String tel){
		super(name);//����Ŭ���� ������ ȣ��
		this.addr=addr;
		this.tel=tel;

	}//cons-end
	//�޼��� : �������̵�
	public void disp(){
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+addr);
		System.out.println("��ȭ : "+tel);
		System.out.println();
	}//disp()-end
}//class-end
public class Test09_extends {
	public static void main(String[] args) {
		PersonSuper s=new PersonSuper("�ӿ���");
		s.disp();
		//
		//���� Ŭ�������� ���� ��ü ó��
		s=new PersonSub("������",1.2, 1.5);//��ü����,������ ȣ��
		s.disp();
		//
		//���� Ŭ�������� ���� ��ü ó��
		s=new PersonSinsang("��Ʋ��","���� ����","010-1234-5678");//��ü����,������ȣ��
		s.disp();
	}//main-end
}//class-end
