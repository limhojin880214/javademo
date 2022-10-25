package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

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
		LinkedList<Book> stack = new LinkedList<Book>();
		try(Scanner sc = new Scanner(path)){
			while(sc.hasNextLine()) {
				String[] arr = sc.nextLine().split("/");
				Book bk = new Book(arr[0], arr[1], arr[2], arr[3]);
				stack.push(bk);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%-16s\t%9s\t%8s\t%2s\n", "title", "publisher", "writer", "price");
//		for(Book data : Stack) {
//			System.out.printf("%-16s\t%-10s\t%-10s\t%2s\n", data.getTitle(), data.getPublisher(), data.getWriter(), data.getPrice());
//			
//		}
		
		while(!stack.isEmpty()) {
			Book data = stack.pop();
			System.out.printf("%-16s\t%-10s\t%-10s\t%2s\n", data.getTitle(), data.getPublisher(), data.getWriter(), data.getPrice());
		}
		
	
	}//end main()
}//end class











