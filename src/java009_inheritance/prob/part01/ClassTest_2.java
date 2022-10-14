package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1{
	String department;
	
	public ClassTest_2() {
	
	}

	public ClassTest_2(String name, int salay, String department) {
		super(name, salay);
		this.department = department;
	}
	public void callSuperThis() {
		super.prn();
		prn();
	}
	
	public void prn() {
		System.out.println("서브클래스");
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름:%s  연봉:%d  부서:%s", getName(), getSalary(), department);
	}
	
}
