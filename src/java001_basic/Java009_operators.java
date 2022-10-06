package java001_basic;

public class Java009_operators {
	public static void main(String[] args) {
		
		int x = 3;

		//전위 연산자
		++x; // x = x + 1, x+=1
		System.out.println(x);
		
		--x;
		System.out.println(x);
		
		int y = 5;
		
		//후위 연산자
		y++;
		System.out.println(x);
		
		y--;
		System.out.println(x);
		
		//리터널은 증감연사자를 사용할 수 없다.
		//10++;
		
		//상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4;
		//상수는 증감연산자를 사용할 수 없다.
		//NUM++;
		
		
	}
}
