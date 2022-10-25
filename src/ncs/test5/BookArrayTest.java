package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		 // Book 객체를 3개 생성하여 배열에 넣는다.
		 // 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
		 // 실행 결과와 같이 계산 출력
		Book b1 = new Book();
		b1.title = "자바의 정석";
		b1.author = "남궁성";
		b1.price= 30000;
		b1.publisher = "도우출판";
		b1.discountRate = 0.1;
		bArray[0] = b1;
		
		Book b2 = new Book();
		b2.title = "열혈강의 자바";
		b2.author = "구정은";
		b2.price= 29000;
		b2.publisher = "프리렉";
		b2.discountRate = 0.1;
		bArray[1] = b2;
		
		Book b3 = new Book();
		b3.title = "객체지향 JAVA8";
		b3.author = "금영욱";
		b3.price= 30000;
		b3.publisher = "북스홈";
		b3.discountRate = 0.1;
		bArray[2] = b3;

		for(Book bk : bArray) {
			System.out.printf("%s %s %s %d원 %.0f%% 할인\n", bk.title, bk.author, bk.publisher, bk.price, bk.discountRate*100);
			System.out.printf("할인된가격 : %.0f 원\n", bk.price*(1 - bk.discountRate));
			
		}

		

	}
}
