package nsc.prob.test04;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		System.out.print("상품명 : ");
		p.setName(sc.nextLine());		
		System.out.print("가격 : ");
		p.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.print("수량 : ");
		p.setQuantitiy(Integer.parseInt(sc.nextLine()));
		
		System.out.println(p.information());
		sc.close();
	}
}
