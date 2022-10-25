package ncs.test10;

public class Sales extends Employee  implements Bonus{

	public Sales() {
	
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return this.getSalary()*0.13;
	}
	
	public void incentive(int pay) {
		System.out.printf("%-10s %-10s %10d", getName(), getDepartment(), getSalary()*1.2, tax() );
	}
}
