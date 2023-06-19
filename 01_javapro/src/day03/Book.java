package day03;

public class Book {
	String title;
	String author;
	
	public Book(String title){
		this(title, "작자미상");
//		this.title = title;//this를 붙이면 변수이름이 안겹친다(생성자바로 밑줄에 써야 적용됨)
//		this.author = "작자미상";
	}
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	
	}//main
}//class
