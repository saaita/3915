package method;

public class Orange extends Fruit{
	private int price;
	Orange(String name,String color, int price){
		super(name, color);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void view(){
		System.out.print("���� : "+ getName() + "���� : "+ getColor());
		System.out.println(", ���� : "+price);
		
	}
}
