package java020_thread.prob;

public class VendingMachine {
	
	public String getDrink() {
		return "소비자";
	}
	
	public void putDrink(String drink) {
		for(int i= 1; i<=10;i++) {
			System.out.printf("%s : 음료수 No.%d 자판기에 넣기\n" ,drink,i);
			System.out.printf("%s : 음료수 No.%d 꺼내먹음\n" ,getDrink(),i);
			System.out.println();
		}//end for
	}
	
	
	
}
