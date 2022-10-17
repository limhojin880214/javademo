package java011_casting.prob.part03;

public class PartTime extends Employee{
	int day;
	int dayPay;
	
	public PartTime() {
		
	}
	
	public PartTime(String name, String dpt, int day, int dayPay) {
		super(name, dpt);
		this.day = day;
		this.dayPay = dayPay;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t총급여\t%d", super.name, day * dayPay);
	}
}
