package java012_api;

public class Java120_String {

	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	}//end main()
	
	private static void handleMessage(String sn) {
		//제품 아이디, 제품명, 가격, 수량, 제조사를 출력하는 프로그램을 구현하시오.
		String format = "제품아이디:제품명:가격:수량:제조사";
		String[] menu = format.split(":");
		String[] data = sn.split(":");
		if(data.length == menu.length) {
			for(int i = 0; i<menu.length;i++) System.out.println(menu[i] + " : " + data[i]);
		}else {
			System.out.println("메시지 형식이 잘못되었습니다.");
			System.out.println("메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.");
		}
	}
}//end class
