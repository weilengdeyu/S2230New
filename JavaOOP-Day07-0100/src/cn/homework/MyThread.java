package cn.homework;

public class MyThread extends Thread{
	private String data;
    public MyThread(String data) {
    	this.data=data;
	}

	@Override
	public void run() {
		synchronized (data) {
			for (int i = 0; i <10; i++) {
				try {
					Thread.sleep((int)Math.random()*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(data);
			}
		}
	}
	
	public void mydatarun(){
		
	}
}
