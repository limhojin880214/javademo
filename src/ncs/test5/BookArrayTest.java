package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		 // Book 객체를 3개 생성하여 배열에 넣는다.
		 // 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
		 // 실행 결과와 같이 계산 출력
		
		String[][] arr = new String[3][5];
		
		arr[0] = "자바의 정석/남궁성/30000/도우출판/0.1".split("/");
		arr[1] = "열혈강의 자바/구정은/29000/프리렉/0.1".split("/");
		arr[2] = "객체지향 JAVA8/금영욱/30000/북스홈/0.1".split("/");
		
		for(int i = 0; i<bArray.length;i++) {
			for(int j=0; j<5; j++) {
				Book bk = new Book();
				bk.title = arr[i][0aaa];
			}
		}
		

	}
}
