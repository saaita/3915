package method;

public class Fruit_Main {

	static void pack(Fruit f){
		int price = 0;

		if(f instanceof Banana){
			Banana obj = (Banana)f;
			price = obj.getPrice();

		}
		if(f instanceof Orange){
			Orange obj = (Orange)f;
			price = obj.getPrice();

		}
		if (f instanceof Apple){
			Apple obj = (Apple)f;
			price = obj.getPrice();

		}

		System.out.println(price +"��¥��"+ f.getName()+"��(��) ��ҽ��ϴ�.");



	}


	public static void main(String[] args) {
		
		
		
		Banana banana = new Banana("�ٳ���", "�����", 1000);
		Orange orange = new Orange("������","��Ȳ��",2000);
		Apple apple = new Apple("���","������",1500);

		System.out.println("\"�ӿ���\"");
		banana.view();
		orange.view();
		apple.view();
		System.out.println("\"�ӿ���\"");
		System.out.println("\"\\n�� �ٹٲ��̴�\"");
		
		
		
	}
}