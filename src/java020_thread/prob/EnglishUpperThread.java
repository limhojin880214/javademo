package java020_thread.prob;

public class EnglishUpperThread extends Thread{
	String[] arr;
	
	public EnglishUpperThread() {
	
	}
	
	public EnglishUpperThread(String[] arr) {
		this.arr = arr;
	}
	@Override
	synchronized public void run() {
		for(String data : arr)
			System.out.print(data);
		
	}
}
