package cn.happy.day05;
/**
 * 守护线程  守护Angela
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=2; i++) {
			System.out.println(Thread.currentThread()+"第"+i+"次");
		}
		
		Thread t1=new  Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=20; i++) {
					System.out.println(Thread.currentThread()+"第"+i+"次");
				}
			}
		});
		
		t1.setDaemon(true); //代表t1作为主线程的守护线程。。。。。。。
		t1.start();
	}

}
