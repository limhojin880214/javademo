package ncs.test10;

public class Secretary extends Employee implements Bonus{

	public Secretary() {
	
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return this.getSalary()*0.1;
	}
	
	public void incentive(int pay) {
		System.out.printf("%-10s %-10s %10d", getName(), getDepartment(), getSalary()*1.8, tax() );
	}
}
