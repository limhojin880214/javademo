package java004_array;

/*
 * [데이터]
 * 홍길동	90	85	40
 * 이영희	100	35	75
 * 
 * [출력결과]
 * 홍길동	90	85	40	215	71.7
 * 이영희	100	35	75	210	70.0
 * 
 */
public class Java045_array {
	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" }; // String[] name = new String[]{"홍길동", "이영희"};
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } }; // int[][] jumsu = new int[][]{{90,85,40}, {100, 35,75}};

		//int sum = 0;
		for(int index=0;index<name.length;index++) {
			System.out.printf("%8s", name[index]);
			
			int sum = 0;
			for(int col=0; col<3; col++) {
				System.out.printf("%4d", jumsu[index][col]);
				sum += jumsu[index][col];
			}
			//System.out.printf("%4d %6.1f\n", sum, (double)sum/jumsu[index].length);
			//System.out.printf("%4d %6.1f\n", sum, sum/3.0);
			System.out.printf("%4d %6.1f\n", sum, (double)sum/3);
			
		}

	}// end main()
}// end class()
