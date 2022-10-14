package java009_inheritance.prob.part05;
/*
 * 공연장 티켓구매내역 확인 프로그램
 * [데이터]
 * 공연명         /공연장	        / 좌석등급	/ 가격  	/  수량 
 * 클래식기타 리사이틀/예술의전당 체임버홀 	/S	 	/ 50,000/	1
 * 인디 공연		/홍대 벨로쥬    	/무지정좌석	/ 70,000/	2
 * 제비다방 정기 공연	/제비다방      	/무지정좌석	/ 10,000/	4
 * 피아노 리사이틀 	/예술의전당 체임버홀 	/A	 	/ 60,000/	2
 *  
 * 
 * [출력결과]
 * 
 * 
 */


public class Prob05_inheritance {

	public static void main(String[] args) {
	
		PurchaseHistory[] ph = new PurchaseHistory[4];
		ph[0] = new PurchaseHistory("클래식기타 리사이틀", "예술의전당 체임버홀", "S", 50000, 1);
		ph[1] = new PurchaseHistory("인디 공연", "홍대 벨로쥬", "무지정좌석", 70000, 2);
		ph[2] = new PurchaseHistory("제비다방 정기 공연", "제비다방 ", "무지정좌석", 10000, 4);
		ph[3] = new PurchaseHistory("피아노 리사이틀", "예술의전당 체임버홀", "A", 60000, 1);
	
		
		System.out.printf("%8s%8s%4s%4s%4s\n", "공연명", "공연장", "좌석등급" ,"가격", "수량");
		for(PurchaseHistory data : ph) {
			System.out.println(data.toString());
		}
	}
}
