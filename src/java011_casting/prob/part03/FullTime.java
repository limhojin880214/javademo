package java011_casting.prob.part03;

public class FullTime extends Employee{
	int salary;
	int extraPay;
	
	public FullTime() {
	
	}
	
	public FullTime(String name, String dpt, int salary, int extraPay) {
		super(name, dpt);
		this.salary = salary;
		this.extraPay = extraPay;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t총급여\t%d", super.name, salary+extraPay );
	}
}
