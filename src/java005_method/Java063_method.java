package java005_method;

public class Java063_method {
	public static void main(String[] args) {
		int[] num = new int[] {5, 2, 8, 7, 4};
		System.out.printf("최대값:%d\n", max(num));
		System.out.printf("최소값:%d\n", min(num));
		System.out.printf("배열의 크기:%d\n", size(num));
	}//end main()
	
	
	//최대값
	public static int max(int[] arr) {
		int res = arr[0];
		for(int i=1;i <arr.length;i++) {
//			if(res - arr[i] < 0) res =arr[i];
			if(res < arr[i]) res = arr[i]; 
		}
		return res;
	}//end max()
	
	//최소값
	public static int min(int[] arr) {
		int res = arr[0];
		for(int i=1;i <arr.length;i++) {
			if(res - arr[i] > 0) res =arr[i];
		}
		return res;
	}//end min()
	
	//배열의 크기
	public static int size(int[] arr) {
		
		return arr.length;
	}//end size()
}//end class
