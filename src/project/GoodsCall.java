package project;

import java.util.List;
import java.util.Scanner;

public class GoodsCall {
	private static Scanner sc = new Scanner(System.in);
	
	public static void readGoods(GoodsController gController) {
		List<GoodsDTO> aList = gController.readProcess();
		System.out.printf("%-4s %4s %4s\n", "상품명", "단가", "재고");
		for(GoodsDTO dto : aList)
			System.out.println(dto.toString());
	}//end readCall()
	
	public static void createGoods(GoodsController gController) {
		System.out.print("상품명 :");
		String name = sc.next();
		
		//중복체크
		if(checkGoods(gController, name)) {
			System.out.println("이미 상품이 있어 정보를 수정합니다.");
			updateGoods(gController, name);
		}else {
			createGoods(gController, name);
		}
	}//end createGoods()
	
	private static boolean checkGoods(GoodsController gController, String name) {
		boolean ck = false;
		List<GoodsDTO> aList = gController.readProcess();
		for(GoodsDTO data : aList) {			
			if(data.getName().equals(name)) {
				ck = true;
			}
		}//중복 체크
		return ck;
	}//end checkGoods()
	
	private static void createGoods(GoodsController gController, String name) {
		System.out.print("상품 가격 :");
		int price = Integer.parseInt(sc.next());
		System.out.print("상품 수량 :");
		int amount = Integer.parseInt(sc.next());
		GoodsDTO dto = new GoodsDTO(name, price, amount);
		
		int chk = gController.createProcess(dto);
		if(chk > 0) {
			System.out.printf("%s, 단가 %d원, 수량 %d개 정보 추가 완료\n", name, price, amount);
		}else {
			System.out.println("상품 추가 실패");
		}
	}//end createGoods()
	
	static void updateGoods(GoodsController gController) {
		readGoods(gController);
		System.out.print("수정할 상품명 입력:");
		String update = sc.next();
		
		//중복체크
		if(checkGoods(gController, update)) {
			updateGoods(gController, update);
		}else {
			System.out.println("상품이 없어 새로 추가합니다.");
			createGoods(gController, update);
		}
	}//end updateGoods()
	
	private static void updateGoods(GoodsController gController, String name) {
		System.out.print("수정 가격 입력:");
		int updatePrice = Integer.parseInt(sc.next());
		System.out.print("수정 수량 입력:");
		int updateAmount = Integer.parseInt(sc.next());
		GoodsDTO dto = new GoodsDTO(name, updatePrice, updateAmount);
		
		int chk = gController.updateProcess(dto);
		if(chk > 0 ) {
			System.out.printf("%s, 단가 %d원, 수량 %d개 정보 수정 완료\n", name, updatePrice, updateAmount);
		}else {
			System.out.println("상품 수정 실패");
		}
	}//end updateGoods()
	
	static void deleteGoods(GoodsController gController) {
		readGoods(gController);
		System.out.print("삭제할 상품명 입력:");
		String delete = sc.next();
		int chk = gController.deleteProcess(delete);
		if(chk > 0)
			System.out.printf("%s 삭제\n", delete);
		else
			System.out.println("해당 상품은 없습니다.");
		System.out.println("==========================================================================");
		readGoods(gController);
	}//end deleteGoods()
	
}
