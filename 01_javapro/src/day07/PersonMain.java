package day07;

public class PersonMain {
	//	�޼ҵ� ����(info)
	//	Person�� ��ӹ޾Ƽ� ������� Ŭ�������� ��ü��
	//	�Ű�����(�Ķ����)�� �޴� �޼ҵ�

	static void info(Person p){
		
		// Student ��ü�� �Ѿ���� "�л��Դϴ�."���� ���
		// -> �����ϱ� �޼ҵ� ���
		
		// StudentWorker ��ü�� �Ѿ���� "������ �Դϴ�." ���� ���
		// -> ���ϱ� �޼ҵ� ���
		
		// Researcher ��ü�� �Ѿ����"�������Դϴ�."���
		// -> �����ϱ� �޼ҵ� ���
		
		// Professor ��ü�� �Ѿ����"�����Դϴ�"���
		// -> ����ġ�� �޼ҵ� ���
		if(p instanceof Student){
			System.out.println("�л��Դϴ�.");
			Student s = (Student)p;
			s.study();
		}
		else if(p instanceof Worker){
			Worker obj = (Worker)p;
			obj.work();
			System.out.println("������ �Դϴ�.");
		}
		else if(p instanceof Researcher){
			
			System.out.println("������ �Դϴ�");
		}
		else if(p instanceof Professor){
			System.out.println("���� �Դϴ�.");
		}




	}


	public static void main(String[] args) {


		//Student ��ü�� Person������ ��ĳ����

		Person s  = new Student();

		Person r = new Researcher();
		// ObjdectŬ������ ��� Ŭ������ �θ�Ŭ���� �̱� ������
		// ��� Ŭ������ ��ĳ���� �����ϴ�.
		Object obj = new Professor();


	}
}
