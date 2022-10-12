package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		String pizza = "자바피자";
		int pizzaSize = 10;
		String donut = "자바도넛";
		int donutSize = 2;
		
		res f1 = new res(pizza, pizzaSize); 
		f1.cnt();
		res f2 = new res(donut, donutSize); 
		f2.cnt();
	}//end main()

}//end class

class res {
	String name;
	int size;
	
	public res(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	void cnt() {
		double res = size * size * 3.14;
		if(name == "자바피자") {
			System.out.printf("%s의 면적은 %.1f\n", name, res);
		}else {
			System.out.printf("%s의 면적은 %.2f\n", name, res);
		}
	}
}
