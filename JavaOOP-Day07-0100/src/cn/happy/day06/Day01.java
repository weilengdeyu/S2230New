package cn.happy.day06;
/**
 * 线程的礼让 yield
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
		//面向.NET编程    Webservice wsdl 文档 soap协议  。
		//
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("线程A"+i);
				}
			}
		});

		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					System.out.println("线程B"+i);
					if(i==3){
						System.out.println("线程的礼让");
						Thread.yield();	  //t1.join();;;;t1强制加入到t2，t1执行完成，再执行t2
						
					}
				}
			}
		});
		t2.start();
		t1.start();
		
		
		
		
	}

}
