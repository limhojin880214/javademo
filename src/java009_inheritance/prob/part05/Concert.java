package java009_inheritance.prob.part05;

public class Concert {
	String title;
	String place;
	String grade;
	int price;
	
	public Concert() {
	}

	public Concert(String title, String place, String grade, int price) {
		this.title = title;
		this.place = place;
		this.grade = grade;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s %s %s %d", title, place, grade, price);
	}
	
	
	
	
}
