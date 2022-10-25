package ncs.test11;

import static java.lang.Math.floor;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10;i++) {
			if(list.size()<10) {
				double ran = Math.random();
				list.add((int)floor(ran*100+1));
			}
		}
		//System.out.println(list);
		display(list);
		 //명시한 사용 데이터를 list 에 기록한다.
		 // list 의 데이터를 내림차순 정렬한다.
		 
		 // display() 메소드를 호출한다.

	}
	
	public static void display(List list) {
		
		System.out.println("정렬전 :"+list.toString());
		list.sort(new Decending());
		System.out.println("정렬후 :"+list.toString());
	}
}
