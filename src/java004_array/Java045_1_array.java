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
public class Java045_1_array {
	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" }; // String[] name = new String[]{"홍길동", "이영희"};
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } }; // int[][] jumsu = new int[][]{{90,85,40}, {100, 35,75}};

		for (int i = 0; i < jumsu.length; i++) {
			int sum = 0;
			double avg = 0.0;
			// 이름
			System.out.printf("%5s", name[i]);

			// 점수
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.printf("%5d", jumsu[i][j]);
			}

			// 합계
			for (int j = 0; j < jumsu[i].length; j++) {
				sum += jumsu[i][j];
			}
			System.out.printf("%5s", sum);

			// 평균
			avg = sum / (double) jumsu[i].length;
			System.out.printf("%5.1f", avg);

			// 줄바꿈
			System.out.println();
		}

	}// end main()
}// end class()
