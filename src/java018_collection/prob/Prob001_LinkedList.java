package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */

		File path = new File(".\\src\\java018_collection\\prob\\booklist.txt");
		LinkedList<String> Stack = new LinkedList<String>();
		try(Scanner sc = new Scanner(path)){
			while(sc.hasNextLine()) {
				Stack.push(new String(sc.nextLine()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%16s\t%10s\t%8s\t%2s\n", "title", "publisher", "writer", "price");
		for(String data : Stack) {
			String[] arr = data.split("/");
			System.out.printf("%-16s\t%-10s\t%-10s\t%2s\n", arr[0], arr[1], arr[2], arr[3]);
			
		}
		
	
	}//end main()
}//end class











