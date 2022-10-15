package java009_inheritance.prob.part05;
/*
 * ==================================================
 * PurchaseHistory를 Concert를 상속받아 수정하여 출력하시오.
 * main 메소드와 Concert는 수정하지 마세요.
 * 
 * 1. 매개변수 5개로 객체 생성
 * 2. 총합을 구하는 객체생성
 * 3. Override 이용하여 출력
 * 
 * ======================================
 * 공연장 티켓구매내역 확인 프로그램
 * [데이터]
 * 공연명         	/공연장	        / 좌석등급	/ 가격  		/  수량 
 * 클래식기타 리사이틀	/예술의전당 체임버홀	/S	 		/ 100,000	/	1
 * 인디 공연			/홍대 벨로쥬    	/무지정좌석	/ 70,000	/	2
 * 제비다방 정기 공연	/제비다방      	/무지정좌석	/ 10,000	/	4
 * 피아노 리사이틀 		/예술의전당 체임버홀	/A	 		/ 60,000	/	2
 *  
 * 
 [출력결과]
==================================
<< 공연정보 >>
     공연명	     공연장	    	가격	
클래식기타 리사이틀	예술의전당 체임버홀	100000
   인디 공연	 	홍대 벨로쥬	   	70000
제비다방 정기 공연	제비다방 	   		10000
피아노 리사이틀		예술의전당 체임버홀	60000
==================================
<< 구매 내역 >>
     공연명      공연장       가격   등급   수량 
클래식기타 리사이틀 예술의전당 체임버홀 100000 S 1
인디 공연 홍대 벨로쥬 70000 무지정좌석 2
제비다방 정기 공연 제비다방  10000 무지정좌석 4
피아노 리사이틀 예술의전당 체임버홀 60000 A 1
총합계 : 340000원
 */


public class Prob05_inheritance {

	public static void main(String[] args) {
	
		PurchaseHistory[] ph = new PurchaseHistory[4];
		ph[0] = new PurchaseHistory("클래식기타 리사이틀", "예술의전당 체임버홀", "S", 100000, 1);
		ph[1] = new PurchaseHistory("인디 공연", "홍대 벨로쥬", "무지정좌석", 70000, 2);
		ph[2] = new PurchaseHistory("제비다방 정기 공연", "제비다방 ", "무지정좌석", 10000, 4);
		ph[3] = new PurchaseHistory("피아노 리사이틀", "예술의전당 체임버홀", "A", 60000, 1);

		System.out.println("==================================");
		System.out.println("<< 공연정보 >>");
		System.out.printf("%8s\t%8s\t%6s\t\n", "공연명", "공연장", "가격");
		
		for(PurchaseHistory data : ph) {
			data.display();
		}

		System.out.println("==================================");
		System.out.println("<< 구매 내역 >>");
		System.out.printf("%8s %8s %8s %4s %4s \n", "공연명", "공연장", "가격" ,"등급", "수량");
		//매개변수 5개로 객체 생성하여 출력하고
		//총합을 구하는 객체생성하여 출력하라
		int sum = 0;
		for(PurchaseHistory data : ph) {
			System.out.println(data.toString());
			sum += data.PurchaseTicket();
		}
		System.out.println("총합계 : " + sum + "원");
		
		//
	}
}
