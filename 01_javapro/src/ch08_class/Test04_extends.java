package ch08_class;
//Ŭ extends Ŭ
//�� extends ��
//Ŭ implements ��

class SuperTest{
	protected static int roomNo=3;//��������
	//private static int roomNo=3;// ��Ӱ����ִ���� private�� �̰��� ��������

}//class-end

public class Test04_extends extends SuperTest {
	public static void main(String[] args) {
		//static �޼���� static���� ����� ����,�޼��常 ����� �� �ִ�.
		System.out.println("roomNo:"+roomNo);

	}//main-end
}//class-end
