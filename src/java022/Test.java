package java022;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Book> aList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1:추가 2:수정 3:삭제 4:리스트");
			int num = Integer.parseInt(sc.nextLine());
			if(num==1) {
				System.out.println("추가를 선택");
				
				System.out.print("책제목 입력:");
				String title = sc.nextLine();
				System.out.print("책 가격:");
				int price = Integer.parseInt(sc.nextLine());
				
				Book book = new Book(title, price);
				aList.add(book);
				
				System.out.println("리스트 출력");
				System.out.println(aList.get(0));
				
			}else if(num==2){
				System.out.println("수정을 선택");
			}else if(num==3) {
				System.out.println("삭제를 선택");
			}else if(num==4) {
				System.out.println("리스트를 선택");
				for(Book data : aList)
					System.out.println(data);
			}
		}
	}
}
