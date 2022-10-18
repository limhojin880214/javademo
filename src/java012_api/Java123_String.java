package java012_api;

/*
 * [출력결과]
 * 박상원님은 남성입니다.
 * 김연아님은 여성입니다.
 * 잘못입력하셨습니다.
 */
public class Java123_String {

	public static void main(String[] args) {
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
		
	}
	
	public static void display(String str) {
		String[] arr = str.split(",");
		//if문
		if(arr[1].charAt(7) == '1' || arr[1].charAt(7) == '3') {
			System.out.println(arr[0] + "님은 남성입니다.");
		}else if(arr[1].charAt(7) == '2' || arr[1].charAt(7) == '4' ) {
			System.out.println(arr[0] + "님은 여성입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		//switch
//		switch (arr[1].charAt(7)) {
//			case '1': case '3':
//				System.out.println(arr[0] + "님은 남성입니다.");
//				break;
//			case '2': case '4':
//				System.out.println(arr[0] + "님은 여성입니다.");
//				break;
//			default:
//				System.out.println("잘못입력하셨습니다");
//		}
		
	}
}
