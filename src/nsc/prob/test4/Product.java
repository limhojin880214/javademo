package nsc.prob.test4;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
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

	public int getQuantitiy() {
		return  quantity;
	}

	public void setQuantitiy(int  quantity) {
		this. quantity =  quantity;
	}

	public Product() {
	
	}
	
	public Product(String name, int price, int  quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String information() {
		return "상품명 : " + getName() +"\n" 
				+ "가격 : " + getPrice() + " 원\n" 
				+ "수량 : " + getQuantitiy() +" 개\n" 
				+ "총 구매 가격 : " + Integer.toString(getPrice() * getQuantitiy()) + " 원";
	}
}
