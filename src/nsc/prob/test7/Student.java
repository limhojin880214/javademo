package nsc.prob.test7;

public class Student extends Human {
	String number;
	String major;
	
	public Student() {
	
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super.name = name;
		super.age = age;
		super.height = height;
		super.weight = weight;
		
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
	
		return String.format("%s %d %d %d %s %s", this.name, this.age, this.height, this.weight,this.number,this.major );
	}
	
	
	
	
}
