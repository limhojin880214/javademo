package java020_thread.prob;

public class Consumer extends Thread{
	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}
	
	@Override
	public void run() {
		vm.getDrink();
	}
}
