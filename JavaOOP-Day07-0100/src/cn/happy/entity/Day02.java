package cn.happy.entity;
/**
 * 线程的两种实现方案  继承Thread    实现Runnable
 * @author Happy
 *
 */
public class Day02 {
  
	public static void main(String[] args) {

		MyThread t1=new MyThread();
		t1.start();//run方法是给jvm调度， 程序员调度start
		
		
		//里氏替换原则
		Runnable temp=new MyThreadTwo();
		
		Thread t2=new Thread(temp);
		
		t2.start();
		
		

	}

}
