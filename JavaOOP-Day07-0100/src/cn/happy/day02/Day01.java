package cn.happy.day02;
/**
 * �����̵߳����ȼ�       1~10֮�䣬 Ĭ��Ϊ 5 
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
