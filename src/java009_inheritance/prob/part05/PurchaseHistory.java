package java009_inheritance.prob.part05;

public class PurchaseHistory extends Concert{
	String grade;
	int quantity;
	
	public PurchaseHistory() {
	}
	//아래에 구현
	public PurchaseHistory(String title, String place, String grade, int price, int quantity) {
		super(title, place, price);
		this.grade = grade;
		this.quantity = quantity;
	}
	
	public int PurchaseTicket() {
		return super.price * this.quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d", super.toString(), grade, quantity);
	}
	
}
