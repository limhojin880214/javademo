package nsc.prob.test12;

public class Fruit {
	String name;
	int price;
	int quantity;
	
	public Fruit() {
	
	}

	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
	
		return String.format("%s, %d원, %d개", name, price, quantity);
	}
	
}
