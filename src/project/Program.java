package project;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Active.loadFile();	//파일 불러오기
		
		boolean run = true; // 프로그램 동작
		while (run) {
			try {
				System.out.println();
				System.out.println("==========================================================================");
				System.out.println("1. 상품 추가 / 2. 재고 정보 / 3. 상품 정보 수정 / 4. 상품 제거 / 5. 저장 후 종료 / 6. 종료");
				System.out.print("번호 입력 : ");
				int choice = Integer.parseInt(sc.next());
				switch (choice) {
				case 1:
					System.out.println("==========================================================================");
					//System.out.println("상품 추가 선택");
					Active.createGoods();
					break;
				case 2:
					System.out.println("==========================================================================");
					//System.out.println("재고 정보 확인");
					Active.readGoods();
					break;
				case 3:
					System.out.println("==========================================================================");
					//System.out.println("상품 정보 수정");
					Active.updateGoods();
					break;
				case 4:
					System.out.println("==========================================================================");
					//System.out.println("상품 제거");
					Active.deleteGoods();
					break;
				case 5:
					System.out.println("==========================================================================");
					System.out.println("저장 후 종료");
					Active.saveData();
					run = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("==========================================================================");
					run = false;
					System.out.println("프로그램 종료");
				}// end switch
				}catch(NumberFormatException ex) {
					System.out.println("잘못된 값을 입력하여 메인으로 이동합니다.");
				}
			} // end while
		
	}// end main()

}// end class
