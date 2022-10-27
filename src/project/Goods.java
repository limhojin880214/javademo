package project;

public class Goods {
	private String name;	//상품명
	private int price;		//상품 가격
	private int amount;		//상품 수량
	
	public Goods() {
	
	}

	public Goods(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format("%-4s %6d %6d", name, price, amount);
	}
	
	
}
