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
	
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary() *1.1));
		System.out.printf("%-10s %-10s %10d %10.1f\n", getName(), getDepartment(), getSalary(), tax() );
	}
}
