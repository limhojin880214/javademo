package nsc.prob.test07;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		 // Student 객체를 3개 생성하여 배열에 넣는다.
		 // 배열에 있는 객체 정보를 모두 toString() 으로 출력 한다. – for 문을 이용 할 것
		
		Student st1 = new Student();
		st1.name = "홍길순";
		st1.age = 25;
		st1.height = 171;
		st1.weight = 81;
		st1.number = "201401";
		st1.major = "영어영문학";
		students[0] = st1;
		
		Student st2 = new Student();
		st2.name = "한사랑";
		st2.age = 23;
		st2.height = 183;
		st2.weight = 72;
		st2.number = "201402";
		st2.major = "건축학";
		students[1] = st2;
		
		Student st3 = new Student();
		st3.name = "임꺽정";
		st3.age = 26;
		st3.height = 175;
		st3.weight = 65;
		st3.number = "201403";
		st3.major = "체육학";
		students[2] = st3;
		
		for(Student data : students) {
			System.out.println(data.toString())
			;
		}
	}
}
