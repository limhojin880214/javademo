package java020_thread.prob;

public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1=new EnglishLowerThread();
		EnglishUpperThread t2=new EnglishUpperThread();
		KoreanThread t3=new KoreanThread();

		String[] lt = "abcdefghijklmnopqrstuvwxyz".split("");
		String[] ut = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		String[] kt = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ".split("");
		
		
		try {
			t1 = new EnglishLowerThread(lt);
			t1.setPriority(Thread.MAX_PRIORITY);
			t1.start();
			Thread.sleep(1000);
			System.out.println();
			t2 = new EnglishUpperThread(ut);
			t2.setPriority(Thread.NORM_PRIORITY);
			t2.start();
			Thread.sleep(1000);
			System.out.println();
			t3 = new KoreanThread(kt);
			t3.setPriority(Thread.MIN_PRIORITY);
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}//end main()

}//end class
