package java020_thread.part03;

/*
 * 스레드 생명주기(Thread Life Cycle)
 * start() - 실행준비상태(RUNNABLE) - run() - TERMINATED
 * 							sleep(시간), wait()-대기상태(WAITTING)
 * 
 */
public class LifeCycle extends Thread{

	public LifeCycle() {
	
	}//end LifeCycle
	
	@Override
	public void run() {
		System.out.println(getState());
	}//end run()
}
