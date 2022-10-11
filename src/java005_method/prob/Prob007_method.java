package java005_method.prob;
/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */

public class Prob007_method {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 16, 11, 31 };

		int[] result1 = sort(arr, "desc");
		int[] result2 = sort(arr, "asc");
		System.out.println("내림 차순 결과");
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("오름 차순 결과");
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}// end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
//		if (orderby == "desc") {
//			int[] desc = new int[array.length];
//			for (int i = 0; i < array.length; i++) {
//				desc[i] = array[i];
//			}
//			for (int i = 0; i < desc.length; i++) {
//				for (int j = 0; j < desc.length; j++) {
//					if (desc[i] > desc[j]) {
//						int temp = desc[i];
//						desc[i] = desc[j];
//						desc[j] = temp;
//					}
//				}
//			}
//			return desc;
//		} else {
//			int[] asc = new int[array.length];
//			for (int i = 0; i < array.length; i++) {
//				asc[i] = array[i];
//			}
//			for (int i = 0; i < asc.length; i++) {
//				for (int j = 0; j < asc.length; j++) {
//					if (asc[i] < asc[j]) {
//						int temp = asc[i];
//						asc[i] = asc[j];
//						asc[j] = temp;
//					}
//				}
//			}
//			return asc;
//		}

		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(orderby == "desc") {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}else {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr;
		
	}// end sort( )
}// end class