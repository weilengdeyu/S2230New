package cn.happy.day07;

public class MyThread extends Thread {
	
	    public Printer printer;
		    @Override
			public void run() {
			   printer.print1();
			}
		  
  
}
