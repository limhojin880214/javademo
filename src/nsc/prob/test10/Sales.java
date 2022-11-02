package nsc.prob.test10;

public class Sales extends Employee  implements Bonus{

	public Sales() {
	
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return this.getSalary()*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary() *1.1));
		System.out.printf("%-10s %-10s %10d %10.1f\n", getName(), getDepartment(), getSalary(), tax() );
	}
}
