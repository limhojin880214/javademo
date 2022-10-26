package java020_thread.prob;

public class KoreanThread extends Thread {
	String[] arr;
	
	public KoreanThread() {
		
	}
	
	public KoreanThread(String[] arr) {
		this.arr = arr;
	}
	
	
	@Override
	synchronized public void run() {
		for(String data : arr)
			System.out.print(data);
		
	}
}
