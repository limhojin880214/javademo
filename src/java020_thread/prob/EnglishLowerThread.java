package java020_thread.prob;

public class EnglishLowerThread extends Thread {
	String[] arr;
	
	public EnglishLowerThread() {
		
	}
	
	public EnglishLowerThread(String[] arr) {
		this.arr = arr;
	}
	
	@Override
	synchronized public void run() {
		for(String data : arr)
			System.out.print(data);
		
	}
}
