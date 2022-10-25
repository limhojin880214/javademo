package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		System.out.print("상품명 : ");
		line += sc.nextLine() + "/";
		System.out.print("가격 : ");
		line += sc.nextLine() + "/";
		System.out.print("수량 : ");
		line += sc.nextLine();
	
		String[] data = line.split("/");
		Product p = new Product();
		p.setName(data[0]);
		p.setPrice(Integer.parseInt(data[1]));
		p.setQuantitiy(Integer.parseInt(data[2]));
		
		System.out.println(p.information());
	}
}
