package ncs.test10;

public class Secretary extends Employee implements Bonus{

	public Secretary() {
	
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return 0;
	}
	
	public void incentive(int pay) {
		
	}
}
