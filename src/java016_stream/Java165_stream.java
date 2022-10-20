package java016_stream;

import java.util.Scanner;

/*
 * [순번 이름 평균]입력
 * 
 * 순번:10
 * 이름:홍길동
 * 평균:9.5
 */
public class Java165_stream {

	public static void main(String[] args) {
		System.out.println("[순번 이름 평균]입력: ");
		Scanner sc = new Scanner(System.in);
		int num; //순번
		String name; //이름
		double avg; //평균

		num = sc.nextInt();
		name = sc.next();
		avg = sc.nextDouble();
		
		System.out.println("순번:" + num);
		System.out.println("이름:" + name);
		System.out.println("평균:" + avg);
		
//		String data = sc.nextLine();
//		String[] arr = data.split(" ");
//		System.out.println("순번:" + arr[0]);
//		System.out.println("이름:" + arr[1]);
//		System.out.println("평균:" + arr[2]);
		
	
	}//end main()
	
	
}//end class
