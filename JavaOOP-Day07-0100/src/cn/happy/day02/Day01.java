package cn.happy.day02;
/**
 * 设置线程的优先级       1~10之间， 默认为 5 
 * @author Happy
 *
 */
public class Day01 {

	public static void main(String[] args) {
	   MyThread t1=new MyThread();
	   t1.setPriority(1);
	   t1.start();
	   
	   Runnable temp=new MyThreadTwo();
	   Thread t2=new Thread(temp);
	   t2.start();
	   
 
	}

}
