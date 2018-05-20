package cn.happy.day07;

public class MyThreadTwo extends Thread {
	
	  public Printer printer;
	  @Override
		public void run() {
		   printer.print2();
		}
		  
  
}
