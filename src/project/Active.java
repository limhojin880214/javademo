package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Active {
	private static ArrayList<Goods> gList = new ArrayList<Goods>(); // 상품을 담는 리스트
	private static Scanner sc = new Scanner(System.in);
	
	static void loadFile() {
		File file = new File("src/project/data.txt");	//데이터가 저장된 파일

		try(Scanner dsc = new Scanner(file)){
			while(dsc.hasNextLine()) {
				Goods dgd = new Goods();
				String[] data = dsc.nextLine().split("/");
				dgd.setName(data[0]);
				dgd.setPrice(Integer.parseInt(data[1]));
				dgd.setAmount(Integer.parseInt(data[2]));
				gList.add(dgd);
			}
		} catch (FileNotFoundException e) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			//System.out.println("파일 생성");	//생성 확인용
		}
	}
	
	
	static void createGoods() {
		System.out.print("상품명 :");
		String name = sc.next();
		
		if(checkGoods(name)) {
			System.out.println("이미 상품이 있어 정보를 수정합니다.");
			updateGoods(name);
		}else {
			createGoods(name);
		}
		
	}//end createGoods()

	private static void createGoods(String name) {
		System.out.print("상품 가격 :");
		int price = Integer.parseInt(sc.next());
		System.out.print("상품 수량 :");
		int amount = Integer.parseInt(sc.next());
		Goods gd = new Goods(name, price, amount);
		gList.add(gd);
		System.out.printf("%s, 단가 %d원, 수량 %d개 정보 추가 완료\n", gd.getName(), gd.getPrice(), gd.getAmount());
	}//end createGoods(String name)
	
	private static boolean checkGoods(String name) {
				boolean ck = false;
				for(Goods data : gList) {			
					if(data.getName().equals(name)) {
						ck = true;
					}
				}//중복 체크
				return ck;
	}//end checkGoods(String name)
	
	static void readGoods() {
		if(gList.isEmpty()) {
			System.out.println("상품 정보가 없습니다.");
		}else {
			System.out.printf("%-4s %4s %4s\n", "상품명", "단가", "재고");
			for (Goods data : gList)
				System.out.println(data.toString());
		}
	}//end readGoods()
	
	static void updateGoods() {
		readGoods();
		System.out.print("수정할 상품명 입력:");
		String update = sc.next();
		
		if(checkGoods(update)) {
			updateGoods(update);
		}else {
			System.out.println("상품이 없어 새로 추가합니다.");
			createGoods(update);
		}
	}//end updateGoods()
	
	private static void updateGoods(String name) {
		System.out.print("수정 가격 입력:");
		int updatePrice = Integer.parseInt(sc.next());
		System.out.print("수정 수량 입력:");
		int updateAmount = Integer.parseInt(sc.next());
		
		for (Goods data : gList) {
			if(name.equals(data.getName())) {
				data.setPrice(updatePrice);
				data.setAmount(updateAmount);
				System.out.printf("%s, 단가 %d원, 수량 %d개 정보 수정 완료\n", data.getName(), data.getPrice(), data.getAmount());
			}
		}
	}//end updateGoods(String name)
	
	static void deleteGoods() {
		readGoods();
		System.out.print("삭제할 상품명 입력:");
		String delete = sc.next();
		boolean ck = true;	//상품 유무
		for (int i = 0; i<gList.size();i++) {
			Goods gd = gList.get(i);
			if(gd.getName().equals(delete)) {
				gList.remove(i);
				System.out.println("삭제 완료");
				ck = false;
			}
		}
		if(ck)System.out.println("해당 상품은 없습니다.");
		System.out.println("==========================================================================");
		readGoods();
	}//end deleteGoods()
	
	static void saveData() {
		File file = new File("src/project/data.txt");
		try(Scanner dsc = new Scanner(file)){
			//파일에 저장
			try(FileWriter fw = new FileWriter(file)) {
				for(Goods data : gList) {
					fw.write(data.getName() + "/" + data.getPrice() + "/"+data.getAmount()+"\n");
				}
			}catch(Exception ex) {
				System.err.println(ex.toString());
			}
		} catch (FileNotFoundException e) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("파일 생성");
		} 
	}//end saveData()
}
