package java012_api;

public class Java119_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);
		
		
	}//end main()
	
	public static char[] display(String alpa) {
		//alpa매개변수에 저장된 문자열을 reverse한 후 반환하는
		//프로그램을 구현하세요.
		char[] rev = new char[alpa.length()];
		for(int i=0; i<alpa.length();i++) {
			rev[i] = alpa.charAt(alpa.length()-1-i);  
		}
		return rev;
	}//end display()
}//end class
