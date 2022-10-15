package java009_inheritance.prob.part05;

public class Concert {
	String title;
	String place;
	int price;
	
	public Concert() {
	}
	
	public Concert(String title, String place, int price) {
		this.title = title;
		this.place = place;
		this.price = price;
	}
	
	void display() {
		System.out.printf("%8s\t%8s\t%8d\n", title, place, price);
	}
	
	public String toString() {
		return String.format("%s %s %d", title, place, price);
	}
	
	
}
