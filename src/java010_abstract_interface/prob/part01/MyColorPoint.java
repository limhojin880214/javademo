package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{

	String color;

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	protected void reverse() {
		int temp = this.x;
		this.x = y;
		this.y = temp;
		
	}
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	protected void show() {
		System.out.println(this.x +", " +this.y +", "+ this.color);;
	}
}
