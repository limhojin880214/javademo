package java009_inheritance.prob.part05;

public class PurchaseHistory extends Concert{
	int quantity;
	
	public PurchaseHistory() {
	}
	
	public PurchaseHistory(String title, String place, String grade, int price, int quantity) {
		super(title, place, grade, price);
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d", super.title, super.place, super.grade, super.price, quantity);
	}
	
}
