package java022;

public class Book {
	String title;
	int price;
	
	public Book() {
	
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", title, price);
	}
}
