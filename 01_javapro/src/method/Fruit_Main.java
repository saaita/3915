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

		System.out.println(price +"원짜리"+ f.getName()+"을(를) 담았습니다.");



	}


	public static void main(String[] args) {
		
		
		
		Banana banana = new Banana("바나나", "노란색", 1000);
		Orange orange = new Orange("오렌지","주황색",2000);
		Apple apple = new Apple("사과","빨간색",1500);

		System.out.println("\"임영웅\"");
		banana.view();
		orange.view();
		apple.view();
		System.out.println("\"임영웅\"");
		System.out.println("\"\\n은 줄바꿈이다\"");
		
		
		
	}
}
