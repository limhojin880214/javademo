package java009_inheritance.prob.part02;

public class StudentExam extends Human{
	String num;
	
	public StudentExam() {
	
	}
	
	public StudentExam(String name, int age, int height, int weight, String num) {
		super(name, age, height, weight);
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.format("%4s %4s %10s %8s %11s", super.name, super.age, super.height, super.weight, num);
	}
}
