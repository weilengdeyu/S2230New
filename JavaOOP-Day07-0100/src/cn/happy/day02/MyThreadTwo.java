package cn.happy.day02;

public class MyThreadTwo implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println("Ïß³ÌB");
		}
		
	}

}
