package java017_collection.prob;

import java.util.ArrayList;
import java.util.Vector;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int sum = 0;
		for(BookDTO it :bookList) {
			if(it.getKind().equals(kind)) {
				sum += it.getRentalPrice();
			}
		}

		return sum;
	}//end getRentalPrice()
}//end class








