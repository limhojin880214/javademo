package java002_statements;

/*
 * 조건식을 만족할때만 수행할 문장이 있는 경우
 * if(조건식) {
 * 		if(조건식) {
 * 		
 * 		}else{
 *		if(조건식){
 * 
 * 		}
 * 		}
 * 	}
 * 
 */
public class Java018_if {
	public static void main(String[] args) {
		boolean member = false; //회원(false) or 비회원(true)
		String grade = "일반"; 	//회원등급(VIP, 일반)
		
		if(!member) {
			//회원
			if(grade=="VIP") {
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 30);
			}else {
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 10);
			}
			
		}else {
			//비회원
			System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 0);
		}
	}//end main()
}//end class()
