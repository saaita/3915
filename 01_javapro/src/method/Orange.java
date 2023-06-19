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
		System.out.print("종류 : "+ getName() + "색깔 : "+ getColor());
		System.out.println(", 가격 : "+price);
		
	}
}
