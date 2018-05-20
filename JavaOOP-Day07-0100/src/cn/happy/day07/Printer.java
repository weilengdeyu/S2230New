package cn.happy.day07;

/**
 * 打印机
 * 
 * @author Happy
 *
 */
public class Printer {

	
	//需要Object对象   对象锁    引用类型的实例
	Object obj=new Object();
	public  void print1(){
	   for (int i =1; i <=50; i++) {
		    synchronized (this) {
			      System.out.print("微");
				  System.out.print("冷");
				  System.out.print("的");
				  System.out.print("雨");
				  System.out.println("");  
	    	}
		
	   }
   }

	public  void print2() {
		for (int i = 1; i <= 50; i++) {
			synchronized (this) {
				System.out.print("好");
				System.out.print("人");
				System.out.println("");
		   }
		}
	}
}
