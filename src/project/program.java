package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	private static ArrayList<Goods> gList = new ArrayList<Goods>(); // 상품을 담는 리스트
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true; // 프로그램 동작
		while (run) {
			System.out.println("==============================================================");
			System.out.println("1. 상품 추가 / 2. 재고 정보 / 3. 상품 정보 수정 / 4. 상품 제거 / 5. 종료");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(sc.next());
			switch (choice) {
			case 1:
				System.out.println("==============================================================");
				System.out.println("상품 추가 선택");
				createGoods();
				break;
			case 2:
				System.out.println("==============================================================");
				System.out.println("재고 정보 확인");
				readGoods();
				break;
			case 3:
				System.out.println("==============================================================");
				System.out.println("상품 정보 수정");
				updateGoods();
				break;
			case 4:
				System.out.println("==============================================================");
				System.out.println("상품 제거");
				deleteGoods();
				break;
			default:
				System.out.println("==============================================================");
				run = false;
				System.out.println("프로그램 종료");
			}// end switch
		} // end while
	}// end main()

	private static void createGoods() {
		System.out.print("상품명 :");
		String name = sc.next();
		System.out.print("상품 가격 :");
		int price = Integer.parseInt(sc.next());
		System.out.print("상품 수량 :");
		int amount = Integer.parseInt(sc.next());
		Goods gd = new Goods(name, price, amount);
		gList.add(gd);
		System.out.printf("%s, 단가 %d원, 수량 %d개 정보 추가 완료\n", gd.getName(), gd.getPrice(), gd.getAmount());
	}//end createGoods()

	private static void readGoods() {
		System.out.printf("%-4s %4s %4s\n", "상품명", "단가", "재고");
		for (Goods data : gList)
			System.out.println(data.toString());
	}//end readGoods()
	
	private static void updateGoods() {
		for (Goods data : gList) {
			System.out.println(data.toString());
		}
		System.out.print("수정할 상품명 입력:");
		String update = sc.next();
		System.out.print("가격 입력:");
		int updatePrice = Integer.parseInt(sc.next());
		System.out.print("수량 입력:");
		int updateAmount = Integer.parseInt(sc.next());
		
		for (Goods data : gList) {
			if(update.equals(data.getName())) {
				data.setPrice(updatePrice);
				data.setAmount(updateAmount);
				System.out.printf("%s, 단가 %d원, 수량 %d개 정보 수정 완료\n", data.getName(), data.getPrice(), data.getAmount());
			}
		}
	}//end updateGoods()
	
	private static void deleteGoods() {
		for (Goods data : gList) {
			System.out.println(data.toString());
		}
		System.out.print("삭제할 상품명 입력:");
		String delete = sc.next();
		for (int i = 0; i<gList.size();i++) {
			Goods gd = gList.get(i);
			if(gd.getName().equals(delete)) {
				gList.remove(i);
				System.out.println("삭제 완료");
			}
		}
		System.out.println("==============================================================");
		for (Goods data : gList) {
			System.out.println(data.toString());
		}
	}
	
}// end class
