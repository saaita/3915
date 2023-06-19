package method;

public class Apple extends Fruit{
	private int price;
	Apple(String name,String color, int price){
		super(name, color);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
