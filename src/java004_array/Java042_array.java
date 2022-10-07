package java004_array;

public class Java042_array {
	public static void main(String[] args) {
		
		char[] data = new char[] {'a', 'b', 'F', 'R','a'};
		int cnt = 0;	//대문자 갯수를 저장하기 위한 변수
		for(int i = 0; i<data.length;i++) {
			if(data[i] >= 'A' && data[i] <= 'Z') cnt++;
		}
		System.out.printf("대문자 갯수는 %d개", cnt);
	}
}
