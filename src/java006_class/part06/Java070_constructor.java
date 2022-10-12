package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개 이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 	  [기본생성자]
 * 	  - 클래스의 접근제어자하고 같고 파라미터가 없는 구조이다.
 * 	 	public HandPhone() {}
 * 	  - 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
 */
public class Java070_constructor {
	
	public static void main(String[] args) {
		/* 1. HandPhone hp : stack area에 4바이트 메모리 생성
		 * 2. new : heap area에 객체를 생성
		 * 3. HandPhone() : heap area에 생성된 멤버변수에 초기값을 할당
		 * 4. = : heap area에 생성된 객체의 메모리 주소를 stack area에 할당
		 * 
		 */
		HandPhone hp = new HandPhone();
		hp.display();
		
		HandPhone hn = new HandPhone("홍길동");
		hn.display();
		
		HandPhone he = new HandPhone("홍길동", "0010-6893-5836");
		he.display();
	}
}
