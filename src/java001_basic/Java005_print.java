package java001_basic;

public class Java005_print {
	public static void main(String[] args) {
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; // true or false
		String sData = "java";
		
		System.out.println(bNum + "," + sNum);
		
		/*
		 *	System.out.printf("출력형식", 값1, 값2, 값...)
		 *	출력기호
		 * 	%d : 정수(byte, short, int, long)
		 * 	%f : 실수(float, double)
		 * 	%b : 논리(boolean)
		 *  %c : 문자(char)
		 *  $s : 문자열(String)
		 *  %% : %
		 *  \n : 줄바꿈
		 *  \t : 탭
		 */
		
		//2 4 5 6 2.500000 7.400000 true a java
		System.out.printf("%d %d %d %d %f %f %b %c %s\n", bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		
		System.out.printf("%d %% %d = %d\n", 5, 2, (5%2));
		
		System.out.print("java");
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");
		System.out.println("test");
	}
}
