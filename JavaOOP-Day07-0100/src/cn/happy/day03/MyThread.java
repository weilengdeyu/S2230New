package cn.happy.day03;

public class MyThread extends Thread {

	 @Override
	public void run() {
		 for (int i = 1; i <=3; i++) {
			    try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 	System.out.println("Ïß³ÌA");
		 }
	}
	

}
