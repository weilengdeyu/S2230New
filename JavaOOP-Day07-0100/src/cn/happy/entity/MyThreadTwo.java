package cn.happy.entity;

public class MyThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("我是子线程二");
	}

}
