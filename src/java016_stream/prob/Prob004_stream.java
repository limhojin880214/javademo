package java016_stream.prob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * [문제]
 *  jumsu.txt 파일로부터 학생의 점수를 읽어들여 총점과 평균을 jumsu.txt 파일 끝에 덧붙여 출력하는 프로그램을 작성하시오.
    단, 평균점수는 소수점 첫 번째 자리까지만 남기고 나머지는 잘라낸다.(truncate) 
    
    [프로그램 실행결과]
    태연:65
	수영:97
	제시카:100
	티파니:86
	써니:88
	총점:436
	평균:87.2
 */
public class Prob004_stream {
	public static void main(String[] args) {
		// 프로그램을 구현하시오.
		File fr=new File(".\\src\\java016_stream\\prob\\jumsu.txt");
		int sum = 0;
		int member = 0;
		try(Scanner sc = new Scanner(fr)){
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
				String[] avg = data.split(":");
				sum += Integer.parseInt(avg[1]);
				member++;
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		System.out.printf("총점:%d\n", sum);
		System.out.printf("평균:%.1f\n", (double)sum/member);
		
	}//end main()
}//end class








