package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 .
		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
		// 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다 .
		// 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
		
		Secretary e1 = new Secretary();
		e1.setName("Hilery");
		e1.setNumber(1);
		e1.setDepartment("secretary");
		e1.setSalary(800);
		employees[0] = e1;
		
		Sales e2 = new Sales();
		e2.setName("Clinten");
		e2.setNumber(2);
		e2.setDepartment("sales");
		e2.setSalary(1200);
		employees[1] = e2;
		
		System.out.printf("%-10s %-10s %10s\n", "name", "department", "salary");
		System.out.println("--------------------------------");
		for(Employee data : employees)
		System.out.println(data.toString());
		
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.printf("%-10s %-10s %10s\n", "name", "department", "salary");
		System.out.println("--------------------------------");
		for(Employee data : employees) {
			
		}
			
	}
}
