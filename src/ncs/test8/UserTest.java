package ncs.test8;

public class UserTest {

	public static void main(String[] args) {
		User[] users = new User[3];
		 // User 객체를 3개 생성하여 배열에 넣는다.
		 // 배열에 있는 객체 정보를 모두 toString() 으로 출력 한다. – for 문을 이용 할 것
		User[] copyUsers = new User[users.length];
		//users 가 참조하는 객체들의 복사본을 만든다. - for 문을 이용 할 것
		//copyUsers 의 객체 정보를 모두 출력한다 – for each 문을 이용할 것
		 //users 와 copyUsers 의 각 index 별 객체의 값들이 일치하는지 확인 출력한다.
		
		User u1 = new User();
		u1.setId("user01");
		u1.setPassword("pass01");
		u1.setName("김철수");
		u1.setAge(32);
		u1.setGender('M');
		u1.setPhone("010-1234-5678");
		users[0] = u1;
		
		User u2 = new User();
		u2.setId("user02");
		u2.setPassword("pass02");
		u2.setName("이영희");
		u2.setAge(25);
		u2.setGender('F');
		u2.setPhone("010-5555-7777");
		users[1] = u2;
		
		User u3 = new User();
		u3.setId("user03");
		u3.setPassword("pass03");
		u3.setName("황진이");
		u3.setAge(20);
		u3.setGender('F');
		u3.setPhone("010-9874-5632");
		users[2] = u3;
		
		System.out.println("users list-----------------------");
		for(User d : users) {
			System.out.println(d.toString());
		}
		System.out.println("copyUsers-----------------------");
		copyUsers = users.clone();
		for(User d: copyUsers) {
			System.out.println(d.toString());
		}
		
		System.out.println("비교결과-----------------------");
		for(int i = 0 ;i <users.length;i++) {
			System.out.println(copyUsers[i].equals(users[i]));
		}
		
	}
}
