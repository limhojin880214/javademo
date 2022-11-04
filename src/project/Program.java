package project;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		GoodsController gController = new GoodsController();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				GoodsCall.checkTable(gController);
				System.out.println();
				System.out.println("==========================================================================");
				System.out.println("1. 상품 추가 / 2. 재고 정보 / 3. 상품 정보 수정 / 4. 상품 제거 / 5. 종료");
				System.out.print("번호 입력 : ");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("==========================================================================");
					//System.out.println("상품 추가 선택");
					GoodsCall.createGoods(gController);
					break;
				case 2:
					System.out.println("==========================================================================");
					//System.out.println("재고 정보 확인");
					GoodsCall.readGoods(gController);
					break;
				case 3:
					System.out.println("==========================================================================");
					//System.out.println("상품 정보 수정");
					GoodsCall.updateGoods(gController);
					break;
				case 4:
					System.out.println("==========================================================================");
					//System.out.println("상품 제거");
					GoodsCall.deleteGoods(gController);
					break;
				case 5:
					System.out.println("==========================================================================");
					System.out.println("프로그램 종료");
					sc.close();
					System.exit(0);
				}// end switch
				}catch(NumberFormatException ex) {
					System.out.println("잘못된 값을 입력하셨습니다.");
				}
			} // end while
	}// end main()

}// end class
