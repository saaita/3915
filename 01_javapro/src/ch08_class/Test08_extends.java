package ch08_class;
//Ŭ���� ĳ����=���� ����ȯ=casting

//����Ŭ����
class Super22{
	//����� ���� �޼���
	public void disp(){
		System.out.println("Super22.disp() called");

	}//disp()-end



}//class-end
//�Ļ�Ŭ����
class Sub22 extends Super22{
	//�������̵�
	public void disp(){
		System.out.println("Sub22.disp() called");
	}//disp()-end

	//����� ���� �޼���
	public void kk(){
		System.out.println("Sub22.kk() called");
	}//kk()-end
}//class-end
public class Test08_extends {
	public static void main(String[] args) {
		Super22 super22=new Super22();//��ü����,������ȣ��
		super22.disp();
		//
		
		super22=new Sub22();//���� Ŭ���� ������ ���� ��ü ó��
		super22.disp();
		
		//super22.kk();//����
		((Sub22)super22).kk();
		
		int a=(int)77.8;//����
		
	}//main-end
}//class-end
