package java004_array.prob;
/*
 * 학생들의 답안을 채점하는 프로그램을 작성하시오.
 * 다음과 같은 2차원 배열이 학생들의 제출한 답이다.
 * 5명의 학생들이 각각 10문제에 대한 답을 다음과 같이 제출하였다. 
 * 
   [학생 제출 답안]
    소원   1 3 2 4 3 1 4 2 2 1
	예린   3 2 4 2 2 1 1 3 4 1
	은하   2 4 3 2 1 2 1 3 3 4
	유주   2 3 3 1 1 3 2 2 4 4
	신비   3 1 1 2 4 1 2 3 1 3
	
   [정답]
   	1 2 3 4 4 3 2 1 1 2
   	
   [출력결과]
     소원 점수 : 2점
     예린 점수 : 1점
     은하 점수 : 1점
     유주 점수 : 3점
     신비 점수 : 3점
	
 */
public class Prob_05 {

	public static void main(String[] args) {
		String[] sname = new String[] {소원, 예린, 은하, 유주,신비};
		int[][] sscore = new int[][] {{1, 3, 2, 4, 3, 1, 4, 2, 2, 1},
			{3, 2, 4, 2, 2, 1, 1, 3, 4, 1},
			{2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
			{2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
			{3, 1, 1, 2, 4, 1, 2, 3, 1, 3}
			};
		int[] answer = new int[] {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
		
		int cnt= 0;
		for(int i=0;i<sname.length;i++) {
			for(int j=0; j<sscore[i].length;j++) {
				
			}
			
//			if(answer[i] == sscore[j][i]) {
//				cnt++;
//			}
		}
		System.out.println(cnt);
		
		
	}//end main()

}//end class
