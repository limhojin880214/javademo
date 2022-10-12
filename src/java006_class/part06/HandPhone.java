package java006_class.part06;

public class HandPhone {
	
	//멤버변수
	String name;
	String number;
	
	//기본 생성자
//	public HandPhone() {}
	
	HandPhone() {}
	
	HandPhone(String name) {
		this.name = name;
	}
	
/*
	타입으로 구분
	HandPhone(String number) {
		this.number = number;
	}
*/	
	
	HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
